function solution(start_num, end_num) {
    let answer = [];
    for(let i = start_num; i >= end_num; i--) {
        answer.push(i);
    }
    return answer;
}

let start_num = 10;
let end_num = 3;
console.log(solution(start_num, end_num));