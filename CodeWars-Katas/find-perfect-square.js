// Find Perfect Square

var isSquare = function (n) {
  if (Math.sqrt(n) - Math.ceil(Math.sqrt(n)) === 0) return true;

  return false;
};
