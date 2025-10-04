# TIME COMLEXITY : O(N^2).
# STABLE : TRUE
# SPACE COMPLEXITY : O(1).
#  BEST CASE COMPLEXITY : O(N).

def insertion_sort(arr):
    # STEP 1 : Calculate len of an array.
    n = len(arr)

    # STEP 2 : Iterate over the array and try to place every
    # element in their correct position start from 1.
    for i in range(1, n):
        # Take j idx to curr position.
        j = i

        # STEP 3 : place to their correct postion.
        while j > 0 and arr[j] < arr[j-1]:
            # Swap and decrease j by 1.
            arr[j], arr[j-1] = arr[j-1], arr[j]
            j -= 1



# list
arr = [3, 1, 2, 7, 8]
print("Before Sorting :", arr)

insertion_sort(arr)

print("After Sorting  :", arr)
