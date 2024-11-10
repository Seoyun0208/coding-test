function solution(numbers, n) {
    let sum = 0;
    for(num of numbers) {
        sum += num;
        if (sum > n) {
            break;
        }
    }
    return sum;
}

let numbers = [34, 5, 71, 29, 100, 34];
let n = 123;

console.log(solution(numbers, n));