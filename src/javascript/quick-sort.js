function quickSort(arr, low, high) {
  var i = low;
  var j = high;
  var pivot = arr[low + ((high - low) >> 1)];
  while (i <= j) {
    while (arr[i] < pivot) {
      i++;
    }
    while (arr[j] > pivot) {
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
  if (low < j) {
    quickSort(arr, low, j);
  }
  if (i < high) {
    quickSort(arr, i, high);
  }
}
var a = [2, 48, 3, 1, 87];
quickSort(a, 0, a.length - 1);
console.log(a);