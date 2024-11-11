package lv0;

import java.util.Arrays;

public class _032n번째원소까지 {
    public static int[] solution(int[] num_list, int n) {
    	return Arrays.copyOfRange(num_list, 0, n);
    }

	public static void main(String[] args) {
		int[] num_list = {2, 1, 6};
		int n = 2;
		System.out.println(solution(num_list, n));
	}
}
