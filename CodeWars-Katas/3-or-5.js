/*
Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
*/

function solution(number) {
  var arr = [],
    sum = 0;
  for (i = 1; i < number; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
      sum += i;
    }
  }
  return sum;
}
