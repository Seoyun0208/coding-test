function solution(arr) {
    let answer = [];
    for(num of arr) {
        if (num >= 50 && num % 2 == 0) {
            answer.push(num / 2);
        } else if (num < 50 && num % 2 == 1) {
            answer.push(num * 2);
        } else {
            answer.push(num);
        }
    }
    return answer;
}

let arr = [1, 2, 3, 100, 99, 98];

console.log(solution(arr));