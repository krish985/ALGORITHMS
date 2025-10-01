# TIME COMPLEXITY : O(N^2).
# SPACE COMPLEXITY : O(1).
# NOT STABLE.
def selection_sort(arr) :
    # STEP 1 : Calculate len of an arr.
    n = len(arr)
    
    # STEP 2 : Iterate 0 to n-1 passses Beacause if we perform 
    # that passes last elemnt already in their sorted position.
    for i in range(n-1) :

        # STEP 3 : Find minimum elemnet and swap with i loc.
        min_idx = i

        for j in range(i+1 , n) :
            if arr[j] < arr[min_idx] :
                # Update minIdx.
                min_idx = j
        
        # STEP 4 : Swap the element i , minIdx.
        # For little Optimization.
        if i != min_idx :
            arr[i] , arr[min_idx] = arr[min_idx] , arr[i]
    
    return arr



# Create list.
arr = [ 20 , 3 , 15 , 5 , 7 ]

print("Before Sorting : " , arr)
selection_sort(arr)
print("AfterSorting : " , arr)