// TIME COMLEXITY : O(N^2).
// STABLE : TRUE
// SPACE COMPLEXITY : O(1).
// BEST CASE COMPLEXITY : O(N).
#include <stdio.h>

void insertionSort(int arr[], int n) {
    // STEP 2 : Iterate over the array and try to place every
    // element in their correct position start from 1.
    for (int i = 1; i < n; i++) {
        // Take j idx to curr position.
        int j = i;

        // STEP 3 : place to their correct postion.
        while (j > 0 && arr[j] < arr[j-1]) {
            // Swap and decrease j by 1.
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[] = {3, 1, 2, 7, 8};
    int n = sizeof(arr)/sizeof(arr[0]);

    printf("Before Sorting : ");
    printArray(arr, n);

    insertionSort(arr, n);

    printf("After Sorting  : ");
    printArray(arr, n);

    return 0;
}
