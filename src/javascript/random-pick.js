function randomPick(arr) {
  let length = arr.length;
  let index = 1;
  let pick;
  while (index < length) {
    if (Math.floor((Math.random()) * length) % index == 0) {
      pick = arr[index];
    }
    index++;
  }
  return pick;
}

var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];

console.log(randomPick(arr));