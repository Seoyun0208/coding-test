function solution(myString) {
    return myString.toLowerCase().replaceAll('a', 'A');
}

let myString = "abstract algebra";

console.log(solution(myString));