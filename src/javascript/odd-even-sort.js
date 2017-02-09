function isOdd(value) {
  return (value & 1) == 1;
}

function oddEvenSort(arr) {
  let i = 0;
  let j = arr.length - 1;
  while (i <= j) {
    while (isOdd(arr[i])) {
      i++;
    }
    while (!isOdd(arr[j])) {
      j--;
    }
    if (i <= j) {
      let temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
}

var arr = [
  2,
  2,
  3,
  4,
  5,
  7
];
oddEvenSort(arr);
console.log(arr);