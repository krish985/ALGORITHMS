#include <stdio.h>
#include <stdbool.h>

void bubbleSort(int arr[] , int n);
void printArray(int arr[] , int n);

int main(){
    int arr[] = { 5 , 4 , 1 , 2 , 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    bubbleSort(arr, n);
    printArray(arr , n);

    return 0;
}

void bubbleSort(int arr[] , int n){
 for (int i = 0; i < n - 1; i++) {
        bool flag = false;  // track swaps

        // Last i elements are already in place
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                flag = true;  // swap happened
            }
        }

        // If no swap happened → array is sorted
        if (flag == false) {
            return;
        }
    }
}

void printArray(int arr[], int n){
    for(int i=0; i<n; i++){
        printf("%d\t" , arr[i]);
    }
}