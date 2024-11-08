package lv0;

import java.util.Arrays;

public class _010배열비교하기 {
    public static int solution(int[] arr1, int[] arr2) {
        int diff = arr1.length - arr2.length;
        if (diff != 0) {
        	return diff > 0 ? 1 : -1;
        } else {
        	int arr1Sum = Arrays.stream(arr1).reduce(0, (a,b) -> a + b);
        	int arr2Sum = Arrays.stream(arr2).reduce(0, (a,b) -> a + b);
        	int sumDiff = arr1Sum - arr2Sum;
        	return sumDiff > 0 ? 1 : (sumDiff < 0 ? -1 : 0);
        }
       
    }

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {3, 3, 3, 3, 3};
		System.out.println(solution(arr1, arr2));
	}
}
