function swap(arr, i, j) {
  let temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}
function allPermutation(str, start, end) {
  if (start == end) {
    console.log(str);
  } else {
    for (let i = start; i <= end; i++) {
      swap(str, start, i);
      allPermutation(str, start + 1, end);
      swap(str, start, i);
    }
  }
}

console.log(allPermutation("abc".match(/./g), 0, 2));