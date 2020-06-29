// Simple, given a string of words, return the length of the shortest word(s).

//String will never be empty and you do not need to account for different data types.

function findShort(s) {
  var arr = s.split(" ");
  var short = Number.MAX_SAFE_INTEGER;
  arr.forEach((i) => {
    if (i.length < short) short = i.length;
  });

  return short;
}
