function solution(num_list) {
    for(let i = 0; i < num_list.length; i++) {
        if (num_list[i] < 0) {
            return i;
        }     
    }
    return -1;
}

let num_list = [12, 4, 15, 46, 38, -2, 15];
console.log(solution(num_list));