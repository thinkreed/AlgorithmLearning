function binarySearch(arr, value) {
    var left = 0;
    var right = arr.length - 1;
    var middle = 0;
    while (left <= right) {
        middle = left + ((right - left) >> 1);
        if (arr[middle] < value) {
            left = middle + 1;
        } else if (arr[middle] > value) {
            right = middle - 1;
        } else {
            return middle;
        }
    }
    return -1;
}
console.log(binarySearch([1, 3, 5, 7], 3));