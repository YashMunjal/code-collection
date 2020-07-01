//Given Parenthesis in string, check whether balanced or not

function validParentheses(parens) {
    //TODO
    var stack = [],
        count = 0;
    var parens = parens.split("");
    var top = 0;
    if (parens.length % 2 !== 0) return false;
    parens.forEach((i) => {
        if (i === "(") {
            stack.push("(");
            count++;
            top++;
        } else if (i === ")" && stack[stack.length - 1] === "(") {
            stack.pop();
            top--;
        }
        if (i === ")") {
            count--;
        }
    });

    if (count !== 0) return false;
    else if (top === 0) return true;
    else return false;
}
