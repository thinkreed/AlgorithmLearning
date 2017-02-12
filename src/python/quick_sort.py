#!/usr/bin/env python3

def quickSort(a, low, high):
    i = low
    j = high
    pivot = a[low + ((high - low) >> 1)]
    while i <= j:
        while a[i] < pivot:
            i += 1
        while a[j] > pivot:
            j -= 1
        if i <= j:
            a[i], a[j] = a[j], a[i]
            i += 1
            j -= 1
    if low < j:
        quickSort(a, low, j)
    if i < high:
        quickSort(a, i, high)


if __name__ == "__main__":
    arr = [6, 1, 27, 9, 3, 4, 5, 10, 8]
    quickSort(arr, 0, len(arr) - 1)
    print(arr)