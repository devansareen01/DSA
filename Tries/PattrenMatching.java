import java.util.ArrayList;

 class TrieNode {
    char data;
    boolean isTerminating;// terminate here means that a meaningful word is completing at that terminating
                          // node
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class PattrenMatching {
    TrieNode root;

    public PattrenMatching() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {

            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        for (int i = 0; i < word.length(); i++) {
            add(root, word.substring(i));
        }
    }

    public boolean search(String word) {
        return search(root, word);
    }

    private boolean search(TrieNode root, String word) {
        if (word.length() == 0) {
            return true;

        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return false;
        }
        return search(child, word.substring(1));
    }

    public static boolean isPatternMatching(String pattern, ArrayList<String> words) {
        PattrenMatching pt = new PattrenMatching();
        for (String s : words) {
            pt.add(s);
        }
        return pt.search(pattern);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("sample");
        String pattren = "ample";
        System.out.println(isPatternMatching(pattren, words));

    }

}