function fibonacci(n) {
  if (n < 2) {
    return 1;
  }
  let sum = 0, a = 1, b = 1;
  for (let i = 2; i <= n; i++) {
    sum = a + b;
    a = b;
    b = sum;
  }
  return sum;
}
console.log(fibonacci(6));