// TIME COMPLEXITY : O(N^2).
// SPACE COMPLEXITY : O(1).
// NOT STABLE.

#include <stdio.h>

// Declaration.
void printArray(int arr[] , int n);
void selectionSort(int arr[] , int n);

int main() {
    int arr[] = { 20 , 3 , 15 , 5 , 7 };
    int n = sizeof(arr) / sizeof(arr[0]);
    
    printf("Before Sorting : ");
    printArray(arr , n);
    
    selectionSort(arr , n);

    printf("After Sorting : ");
    printArray(arr , n);

}

// Initialization.
void selectionSort(int arr[] , int n){
    // STEP 1 : Iterate 0 to n-1 passses Beacause if we perform 
    // that passes last elemnt already in their sorted position.
    for(int i=0; i<n-1; i++){
        
        // STEP 2 : Find minimum elemnet and swap with i loc.
        int minIdx = i;

        for(int j=i+1; j<n; j++){

            if(arr[j] < arr[minIdx]){
                // Update minIdx.
                minIdx = j;
            }
        }

        // STEP 3 : Swap the element i , minIdx.
        // For little Optimization.
        if(i != minIdx){
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}

void printArray(int arr[] , int n){

    for(int i=0; i<n; i++){
        printf("%d  " , arr[i]);
    }
    printf("\n");
}

