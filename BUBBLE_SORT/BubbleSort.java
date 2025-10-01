public class BubbleSort {
    // TIME COMPLEXITY : O(N^2).
    public static void bubbleSort(int arr[], int n) {
        // STEP 1 : we have a N no element in an array
        // if we swap adjecent element in every single iterateration.
        // we have to run first loop n-1.
        
        // Note * If array already sorted add optimization.
        // Add flag false after the j iteration swap flag value still 
        // false return.

        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            // STEP 2 : for every whole iteration last element
            // reach their sorted position. that's why taking n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    // Flip flag if swap happend.
                    flag = true;
                }
            }

            // Check 
            if(flag == false) return;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5 , 4 , 1 , 2 , 3};
        bubbleSort(arr, arr.length);
        printArray(arr);
    }
}

// DRY RUN :
// INPUT : 5 , 4 , 1 , 2 , 3
// i = 0
// 4 , 5 , 1 , 2 , 3  = j=0
// 4 , 1 , 5 , 2 , 3  = j=1
// 4 , 1 , 2 , 5 , 3  = j=2
// 4 , 1 , 2 , 3 , 5  = j=3

// i = 1
// 1 , 4 , 2 , 3 , 5  = j=0
// 1 , 2 , 4 , 3 , 5  = j=1
// 1 , 2 , 3 , 4 , 5  = j=2

// i = 2
//  1 , 2 , 3 , 4 , 5  = j=0
//  1 , 2 , 3 , 4 , 5  = j=1
// Boolean flag condition touched return

