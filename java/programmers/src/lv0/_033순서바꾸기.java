package lv0;

import java.util.Arrays;

public class _033순서바꾸기 {
    public static int[] solution(int[] num_list, int n) {
    	int[] answer = new int[num_list.length];
    	int[] arr1 = Arrays.copyOfRange(num_list, 0, n);
    	int[] arr2 = Arrays.copyOfRange(num_list, n, num_list.length);
    	System.arraycopy(arr2, 0, answer, 0, arr2.length);
    	System.arraycopy(arr1, 0, answer, arr2.length, arr1.length);
    	return answer;
    }

	public static void main(String[] args) {
		int[] num_list = {2, 1, 6};
		int n = 1;
		System.out.println(solution(num_list, n));
	}
}
