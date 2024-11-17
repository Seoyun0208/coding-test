function solution(my_string, is_suffix) {
    return my_string.slice(my_string.length - is_suffix.length) == is_suffix ? 1 : 0;
}

let my_string = "banana";
let is_suffix = "ana";
console.log(solution(my_string, is_suffix));