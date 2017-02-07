function bitmapSort(arr) {
  let min = arr[0];
  let max = arr[0];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
    if (arr[i] < min) {
      min = arr[i];
    }
  }
  let tempArr = new Int8Array(max - min + 1);
  for (let i = 0; i < arr.length; i++) {
    let index = arr[i] - min;
    tempArr[index] += 1;
  }
  let index = 0;
  for (let i = 0; i < tempArr.length; i++) {
    while (tempArr[i] > 0) {
      arr[index] = min + i;
      index++;
      tempArr[i]--;
    }
  }
  console.log(arr);
}

var arr = [5, 3, 4, 4, 1];
bitmapSort(arr);