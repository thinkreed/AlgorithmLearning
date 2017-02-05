function findOneNumber(arr) {
  if (arr.length == 0) {
    return undefined;
  }
  let candinate = arr[0];
  let time = 1;
  for (let i = 1; i < arr.length; i++) {
    if (time == 0) {
      candinate = arr[i];
      time = 1;
    } else if (arr[i] == candinate) {
      time++;
    } else {
      time--;
    }
  }
  return candinate;
}

var arr = [1, 2, 2, 2, 2, 3, 5, 6, 7, 8, 8, 8, 8, 8, 9];
console.log(findOneNumber(arr));