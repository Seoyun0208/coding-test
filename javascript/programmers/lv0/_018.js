function solution(strArr) {
    return strArr.map((str,i) => i % 2 ? str.toUpperCase() : str.toLowerCase());
}

let strArr = ["AAA","BBB","CCC","DDD"];

console.log(solution(strArr));