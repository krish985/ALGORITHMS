public class InsertionSort {
    // TIME COMLEXITY : O(N^2).
    // STABLE : TRUE
    // SPACE COMPLEXITY : O(1).
    // BEST CASE COMPLEXITY : O(N).
    public static void insertionSort(int arr[]){
        // STEP 1 : Calculate len of an array.
        int n = arr.length;

        // STEP 2 : Iterate over the array and try to place every
        // element in their correct position start from 1.
        for(int i=1; i<n; i++){
            // Take j idx to curr position.
            int j = i;

            // STEP 3 : place to their correct postion.
            while(j > 0 && arr[j] < arr[j-1]){
                // Swap and decrease j by 1.
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3 , 1 , 2 , 7 , 8 };

        System.out.print("Before Sorting : ");
        printArray(arr);
        
        insertionSort(arr);

        System.out.print("After Sorting : ");
        printArray(arr);

    }
}