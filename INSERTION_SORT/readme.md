# Insertion Sort 

## 📌 Definition
**Insertion Sort** is a simple, intuitive, and stable sorting algorithm.  
It works by taking one element at a time and inserting it into its correct position in the already sorted part of the array.

---

## ⚡ Algorithm
1. Start from the second element (index `1`).
2. Pick the current element (`key`).
3. Compare it with elements before it.
4. Shift all greater elements one position to the right.
5. Insert `key` at its correct position.
6. Repeat until the array is sorted.

---

## ⏳ Complexity
- **Best Case (Already Sorted):** O(N)  
- **Average Case:** O(N²)  
- **Worst Case (Reverse Sorted):** O(N²)  
- **Space Complexity:** O(1)  
- **Stable:** ✅ Yes  

---

## 📝 Example Dry Run
### Input: arr = {3, 1, 2, 7, 8}

### Pass-by-Pass:
| Pass | Key | Action                                   | Array State        |
|------|-----|------------------------------------------|--------------------|
| 1    | 1   | Shift 3 → Place 1                        | {1, 3, 2, 7, 8}    |
| 2    | 2   | Shift 3 → Place 2                        | {1, 2, 3, 7, 8}    |
| 3    | 7   | Already in correct position              | {1, 2, 3, 7, 8}    |
| 4    | 8   | Already in correct position              | {1, 2, 3, 7, 8}    |

---
