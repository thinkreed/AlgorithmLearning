function preProcess(str) {
  let n = str.length;
  if (n == 0) {
    return "^$";
  }
  let ret = "^";
  for (let i = 0; i < n; i++) {
    ret += "#" + str.slice(i, i + 1);
  }
  ret += "#$";
  return ret;
}

function longestParlindrome(str) {
  let processedStr = preProcess(str);
  let n = processedStr.length;
  let arr = new Array();
  let center = 0;
  let rightMargin = 0;
  for (let i = 1; i < n - 1; i++) {
    let iMirror = 2 * center - i;
    arr[i] = (rightMargin > i) ? Math.min(rightMargin - i, arr[iMirror]) : 0;
    while (processedStr[i + 1 + arr[i]] === processedStr[i - 1 - arr[i]]) {
      arr[i]++;
    }
    if (i + arr[i] > rightMargin) {
      center = i;
      rightMargin = i + arr[i];
    }
  }
  let maxLen = 0;
  let centerIndex = 0;
  for (let i = 1; i < n - 1; i++) {
    if (arr[i] > maxLen) {
      maxLen = arr[i];
      centerIndex = i;
    }
  }
  return str.slice((centerIndex - 1 - maxLen) / 2,
    (centerIndex - 1 - maxLen) / 2 + maxLen);
}

console.log(longestParlindrome("babcbabcbaccba"));