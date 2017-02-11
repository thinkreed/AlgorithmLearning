#!/usr/bin/env python3


def binarySearch(arr, n, target):
    left = 0
    right = n - 1
    middle = 0
    while left <= right:
        middle = left + ((right - left) >> 1)
        if arr[middle] < target:
            left = middle + 1
        elif arr[middle] > target:
            right = middle - 1
        else:
            return middle
    return -1


arr = [1, 3, 5, 7, 9]
print(binarySearch(arr, 5, 7))
