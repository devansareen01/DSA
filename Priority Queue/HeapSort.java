public class HeapSort {
    private static void insertInVirtualHeap(int arr[],int i ) {
        int childindex = i;
        int parentIndex = (childindex - 1) / 2;
        while (childindex < arr.length) {
            if (arr[parentIndex] > arr[childindex]) {
                int temp = arr[childindex];
                arr[childindex] = arr[parentIndex];
                arr[parentIndex] = temp;
                childindex = parentIndex;   
                parentIndex = (childindex - 1) / 2;
            } else {
                return;
            }
        }
    }

    private static int removeMinInVirtualHeap(int arr[],int hs) {
        int temp = arr[0];
      
        int index = 0;
        arr[0] = arr[hs - 1];
        hs--;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        while (leftChild < hs) {
            int minIndex = index;

            if (arr[minIndex] > arr[leftChild]) {
                minIndex = leftChild;
            }
            if (rightChild < hs && arr[minIndex] > arr[rightChild]) {
                minIndex = rightChild;
            }
            if (minIndex != index) {
                int temp1 = arr[index];
                arr[index] = arr[minIndex];
                arr[minIndex] = temp1;
                index = minIndex;
                leftChild = 2 * index + 1;
                rightChild = 2 * index + 2;

            } else {
                break;
            }

        }
        return temp;
    }
    public static void HeapSort (int arr[]){
        for(int i = 0;i<arr.length;i++){
            insertInVirtualHeap(arr, i);
        }
        for(int i =0;i<arr.length;i++){
            arr[arr.length-1-i] = removeMinInVirtualHeap(arr, arr.length-i);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 6,2,1,5,19,18};
        HeapSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
