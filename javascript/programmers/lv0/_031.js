function solution(num_list, n) {
    return num_list.filter((num, i) => i % n == 0);
}

let num_list = [4, 2, 6, 1, 7, 6];
let n = 2;
console.log(solution(num_list, n));