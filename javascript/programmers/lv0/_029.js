function solution(names) {
    return names.filter((name, i) => !(i % 5));
}

let names = ["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"];

console.log(solution(names));