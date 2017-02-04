function swap(arr, i, j) {
  let temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

function partion(arr, low, high) {
  let i = low + 1;
  let j = high;
  let pivot = arr[low];
  while (i < j) {
    while (arr[i] <= pivot) {
      i++;
    }
    while (arr[j] > pivot) {
      j--;
    }
    if (i < j) {
      swap(arr, i, j);
    }
  }
  swap(arr, low, j);
  return j;
}

function findMedian(arr) {
  let left = 0;
  let right = arr.length - 1;
  let middle = right >> 1;
  let index = -1;
  while (index != middle) {
    index = partion(arr, left, right);
    if (index < middle) {
      left = index + 1;
    } else if (index > middle) {
      right = index - 1;
    } else {
      break;
    }
  }
  return arr[index];
}

var a = [6, 1, 27, 9, 3, 4, 5, 10, 8];
console.log(findMedian(a));