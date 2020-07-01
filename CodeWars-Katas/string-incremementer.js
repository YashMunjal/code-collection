//5 Kyu

/*Your job is to write a function which increments a string, to create a new string.

If the string already ends with a number, the number should be incremented by 1.
If the string does not end with a number. the number 1 should be appended to the new string.
Examples:

foo -> foo1

foobar23 -> foobar24

foo0042 -> foo0043

foo9 -> foo10

foo099 -> foo100

Attention: If the number has leading zeros the amount of digits should be considered*/

function incrementString(strng) {
  console.log(strng);
  if (!/\d/.test(strng)) {
    return strng + 1;
  } else if (!/[a-zA-Z]+/g.test(strng)) {
    var num = +strng;
    num++;
    return "0".repeat(strng.length - num.toString().length) + num;
  } else {
    var num = strng.match(/\d+/g);
    var alpha = strng.match(/[a-zA-Z]+/g);
    num = +num + 1;
    var x = strng.length - (alpha + num).length;
    if (x <= 0) return alpha + "0".repeat(-x) + num;

    return alpha + num + "";
  }
}
