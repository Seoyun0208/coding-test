function solution(arr, n) {
    return arr.map((a, i) => arr.length % 2 !== i % 2 ? a + n : a)
}

let arr = [49, 12, 100, 276, 33];
let n = 27;

console.log(solution(arr, n));