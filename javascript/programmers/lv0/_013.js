function solution(myString, pat) {
    let changed = '';
    for (let str of myString) {
        if (str == 'A') {
            changed += 'B';
        } else {
            changed += 'A';
        }
    }
    return changed.includes(pat) ? 1 : 0;
}

let myString = "ABBAA";
let pat = "AABB";

console.log(solution(myString, pat));