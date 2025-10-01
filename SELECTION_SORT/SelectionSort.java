public class SelectionSort {
    // TIME COMPLEXITY : O(N^2).
    // SPACE COMPLEXITY : O(1).
    // NOT STABLE.
    public static void selectionSort(int arr[]){
        // STEP 1 : Calculate len of an array.
        int n = arr.length;

        // STEP 2 : Iterate 0 to n-1 passses Beacause if we perform 
        // that passes last elemnt already in their sorted position.
        for(int i=0; i<n-1; i++){

            // STEP 3 : Find minimum elemnet and swap with i loc.
            int minIdx = i;

            for(int j=i+1; j<n; j++){

                if(arr[j] < arr[minIdx]){
                    // Update minIndex.
                    minIdx = j;
                }
            }

            // STEP 4 : Swap the element i , minIdx.
            // For little Optimization.
            if(i != minIdx){
               int temp = arr[i];
               arr[i] = arr[minIdx];
               arr[minIdx] = temp;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = { 20 , 3 , 15 , 5 , 7};
        
        System.out.print("Before Sorting : ");
        printArr(arr);

        selectionSort(arr);

        System.out.print("After Sorting : ");
        printArr(arr);
    }
}
