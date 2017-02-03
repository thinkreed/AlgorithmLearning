function swap(arr, i, j) {
  let temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

function dutchNationalFlag(arr) {
  if (arr.length < 2) {
    return;
  }
  let left = 0;
  let cur = 1;
  let right = arr.length - 1;
  while (cur <= right) {
    if (arr[cur] == 0) {
      swap(arr, cur, left);
      left++;
    } else if (arr[cur] == 1) {
      cur++;
    } else {
      swap(arr, cur, right);
      right--;
    }
  }
}

var arr = [2, 1, 0, 0, 0, 2, 2, 1, 1];
dutchNationalFlag(arr);
console.log(arr);