/*
            An isogram is a word that has no repeating letters, consecutive or non-consecutive.
             Implement a function that determines whether a string that contains only letters is an isogram.
              Assume the empty string is an isogram. Ignore letter case.

            */

function isIsogram(str) {
  var s = str.toLowerCase();

  var x = s.split("");

  return new Set(x).size === str.length;
  // console.log(x);
}
