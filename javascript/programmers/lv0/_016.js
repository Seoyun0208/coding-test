function solution(my_string, alp) {
    return my_string.replaceAll(alp, alp.toUpperCase());
}

let my_string = "programmers";
let alp = "p";

console.log(solution(my_string, alp));