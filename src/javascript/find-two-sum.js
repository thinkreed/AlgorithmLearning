function findTwoSum(arr, sum) {
  let left = 0;
  let right = arr.length - 1;
  let curSum = 0;
  while (left < right) {
    curSum = arr[left] + arr[right];
    if (curSum > sum) {
      right--;
    } else if (curSum < sum) {
      left++;
    } else {
      console.log(arr[left] + " " + arr[right]);
      return;
    }
  }
}

var arr = [1, 3, 5, 7, 9];
findTwoSum(arr, 8);