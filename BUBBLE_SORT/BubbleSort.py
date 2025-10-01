def bubble_sort(arr):
    n = len(arr)
    
    # Traverse through all elements
    for i in range(n - 1):
        # Last i elements are already in place
        for j in range(n - i - 1):
            # Swap if the element found is greater
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    
    return arr


# Example usage
arr = [5, 4, 1, 2, 3]
print("Unsorted:", arr)
sorted_arr = bubble_sort(arr)
print("Sorted:", sorted_arr)
