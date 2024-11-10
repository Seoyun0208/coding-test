function solution(num_list) {
    let odd = num_list.filter((num, i) => i % 2).reduce((a, b) => a + b);
    let even = num_list.filter((num, i) => !(i % 2)).reduce((a, b) => a + b);
    return odd > even ? odd : even;
}

let num_list = [4, 2, 6, 1, 7, 6];

console.log(solution(num_list));