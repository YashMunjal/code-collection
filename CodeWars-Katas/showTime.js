/* 
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
*/

function humanReadable(seconds) {
  // TODO
  var h = Math.floor(seconds / 3600) + "";
  var m = Math.floor((seconds % 3600) / 60) + "";
  var s = Math.floor((seconds % 3600) % 60) + "";

  if (h.length < 2) h = "0" + h;
  if (m.length < 2) m = "0" + m;
  if (s.length < 2) s = "0" + s;

  return h + ":" + m + ":" + s;
}
