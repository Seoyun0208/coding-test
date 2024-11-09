function solution(num, n) {
    return num % n ? 0 : 1;
}

let num = 98;
let n = 2;

console.log(solution(num, n));