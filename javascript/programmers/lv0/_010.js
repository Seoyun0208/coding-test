function solution(arr1, arr2) {
    let diff = arr1.length - arr2.length;
    if (diff !== 0) {
        return diff > 0 ? 1 : -1
    } else {
        let arr1Sum = arr1.reduce((a,b)=> a + b);
        let arr2Sum = arr2.reduce((a,b)=> a + b);
        let sumDiff = arr1Sum - arr2Sum;
        return sumDiff > 0 ? 1 : (sumDiff < 0 ? -1 : 0);
    }
}

let arr1 = [100, 17, 84, 1];
let arr2 = [55, 12, 65, 36];

console.log(solution(arr1, arr2));