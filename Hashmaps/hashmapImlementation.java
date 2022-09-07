
/*public class MapNode<K, V> {
    K key;
    V value;
    MapNode<K, V> next;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
 */

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> buckets;
    int size; // number of entries

    int numbuckets;// number of buckets

    public Map() {
        buckets = new ArrayList<>();
        numbuckets = 5;
        for (int i = 0; i < 5; i++) {
            buckets.add(null);
        }
    }//

    public int getBucketindex(K key) {
        int hashcode = key.hashCode(); // hashcode is the hexadecimal adress of the classes this function is in the
                                       // object class which is parent of all classes
        return hashcode % numbuckets; // compressing the hashcode so that we can get index between array size
    }

    public void insert(K key, V value) {
        int bucketindex = getBucketindex(key); // get index of Linked List head
        MapNode<K, V> head = buckets.get(bucketindex); // collect head
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketindex);
        MapNode<K, V> newNode = new MapNode<>(key, value);
        size++;
        newNode.next = head;
        buckets.set(bucketindex, newNode);
        double loadfactor = (1.0 * size) / numbuckets; // num of enteries/arraysize we have to multiply size * 1.0 so
                                                       // that we can get result in decimal value
        if (loadfactor > 0.7) {
            rehash();
        }
    }

    public double loadfactor() {
        return (1.0 * size) / numbuckets;
    }

    private void rehash() {
        System.out.println("Rehashing " + " numbuckets " + numbuckets + " size " + size);
        ArrayList<MapNode<K, V>> temp = buckets;
        buckets = new ArrayList<MapNode<K, V>>();
        for (int i = 0; i < numbuckets * 2; i++) {
            buckets.add(null);
        }
        size = 0;
        numbuckets *= 2; // update the numbuckets so that load factor will be calculated according to new
                         // numbuckets
        for (int i = 0; i < temp.size(); i++) {
            MapNode<K, V> head = temp.get(i);
            while (head != null) {
                insert(head.key, head.value);
                head = head.next;
            }
        }
    }

    public V getValue(K key) {
        int bucketindex = getBucketindex(key); // get index of LinkedList head
        MapNode<K, V> head = buckets.get(bucketindex); // collect head
        while (head != null) // traverse the ll if find that key return its value
        {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V removekey(K key) {
        int bucketindex = getBucketindex(key);
        MapNode<K, V> head = buckets.get(bucketindex);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) // if head node we want to delete set the next node of head in buckets
                {
                    buckets.set(bucketindex, head.next);
                } else {
                    prev.next = head.next;
                }
                size--;
                return head.value;
            }
            prev = head; // prev = current head
            head = head.next; // move head to next node
        }

        return null;

    }

}
