function solution(my_string) {
    // 정규식 자바와 비교
    // 자바: my_string.trim().split("\\s+");
    // \s+ : 공백이 하나 이상
    return my_string.trim().split(/\s+/);
}

let my_string = " i    love  you";

console.log(solution(my_string));