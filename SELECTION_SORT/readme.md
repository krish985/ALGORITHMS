# Selection Sort 

## Definition

**Selection Sort** is a **comparison-based sorting algorithm** that sorts an array by repeatedly selecting the 
**smallest (or largest) element** from the unsorted portion and swapping it with the **first unsorted element**.
This process is repeated until the entire array is sorted.  

**Step-by-step explanation:**  
1. Find the smallest element in the array and swap it with the first element. This places the smallest element at its correct position.  
2. Then, find the smallest element in the remaining unsorted portion and swap it with the second element.  
3. Repeat this process for the remaining elements, moving each element to its correct position one by one.  
4. Continue until all elements are sorted.  

It is an **in-place algorithm** (requires no extra space) but **not stable** (the relative order of equal elements may change).

---

## Features

- **Time Complexity:** O(n²)  
  - Best Case: O(n²)  
  - Average Case: O(n²)  
  - Worst Case: O(n²)  
- **Space Complexity:** O(1)  
- **Stability:** Not stable  
- **Algorithm Type:** Comparison-based, in-place  

---

## How It Works

1. Start from the first element in the array (index 0).  
2. Find the **minimum element** in the **unsorted portion** of the array.  
3. Swap the minimum element with the first element of the unsorted portion.  
4. Move the boundary of the sorted portion **one step forward**.  
5. Repeat steps 2–4 until the array is completely sorted.

---

## Example

**Input Array:** `[20, 3, 15, 5, 7]`  

**Step-by-step Sorting:**

| Pass | Array State                | Action                            |
|------|--------------------------|-------------------------------------|
| 1    | `[20, 3, 15, 5, 7]`      | Minimum `3` swapped with `20`       |
| 2    | `[3, 20, 15, 5, 7]`      | Minimum `5` swapped with `20`       |
| 3    | `[3, 5, 15, 20, 7]`      | Minimum `7` swapped with `15`       |
| 4    | `[3, 5, 7, 20, 15]`      | Minimum `15` swapped with `20`      |
| Final| `[3, 5, 7, 15, 20]`      | Array completely sorted             |

---
