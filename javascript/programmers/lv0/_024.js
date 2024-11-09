function solution(num_list) {
    return num_list.length > 10 ? num_list.reduce((a,b) => a + b) : num_list.reduce((a,b) => a * b);
}

let num_list = [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1];

console.log(solution(num_list));