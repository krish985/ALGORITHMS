# Bubble Sort 

## Definition

**Bubble Sort** is a **comparison-based sorting algorithm** that repeatedly compares **adjacent elements** and swaps them 
if they are in the wrong order. This process continues until the entire array is sorted.  

**Step-by-step explanation:**  
1. Compare the first and second elements; swap them if the first is greater than the second.  
2. Move to the next pair and repeat the comparison and swap.  
3. Continue this process to the end of the array. After the first pass, the largest element “bubbles up” to its correct position.  
4. Repeat the process for the remaining unsorted portion until the array is completely sorted.  

It is an **in-place algorithm** (requires no extra space) and **stable** (the relative order of equal elements is preserved).

---

## Features

- **Time Complexity:**  
  - Best Case: O(n) (if already sorted)  
  - Average Case: O(n²)  
  - Worst Case: O(n²)  
- **Space Complexity:** O(1)  
- **Stability:** Stable  
- **Algorithm Type:** Comparison-based, in-place  

---

## How It Works

1. Start from the first element in the array.  
2. Compare each pair of adjacent elements and swap if the first is greater than the second.  
3. After each pass, the largest element moves to its correct position.  
4. Reduce the range of unsorted elements and repeat until the array is sorted.

---

## Example

**Input Array:** `[5, 4, 1, 2, 3]`  

Bubble Sort repeatedly compares **adjacent elements** and swaps them if they are in the wrong order. Below is a
**pass-by-pass representation** showing all comparisons and swaps.

---

### Pass 1
| Comparison | Array State After Comparison |
|------------|------------------------------|
| 5 & 4      | `[4, 5, 1, 2, 3]`            |
| 5 & 1      | `[4, 1, 5, 2, 3]`            |
| 5 & 2      | `[4, 1, 2, 5, 3]`            |
| 5 & 3      | `[4, 1, 2, 3, 5]`            |

**Largest element 5 “bubbled” to the end.**

---

### Pass 2
| Comparison | Array State After Comparison |
|------------|------------------------------|
| 4 & 1      | `[1, 4, 2, 3, 5]`            |
| 4 & 2      | `[1, 2, 4, 3, 5]`            |
| 4 & 3      | `[1, 2, 3, 4, 5]`            |

**Second largest element 4 moved to its correct position.**

---

### Pass 3
| Comparison | Array State After Comparison |
|------------|------------------------------|
| 1 & 2      | `[1, 2, 3, 4, 5]`            |
| 2 & 3      | `[1, 2, 3, 4, 5]`            |

**No swaps needed — array is partially sorted.**

---

### Pass 4
| Comparison | Array State After Comparison |
|------------|------------------------------|
| 1 & 2      | `[1, 2, 3, 4, 5]`            |

**No swaps — array fully sorted.**

---

**Final Sorted Array:** `[1, 2, 3, 4, 5]`
