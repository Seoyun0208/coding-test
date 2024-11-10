function solution(my_string, k) {
    let answer = '';
    for (let i = 0; i < k; i++) {
        answer += my_string;
    }
    return answer;
}

let my_string = "string";
let k = 3;

console.log(solution(my_string, k));