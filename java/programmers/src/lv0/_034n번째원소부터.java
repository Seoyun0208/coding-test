package lv0;

import java.util.Arrays;

public class _034n번째원소부터 {
    public static int[] solution(int[] num_list, int n) {
    	return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }

	public static void main(String[] args) {
		int[] num_list = {2, 1, 6};
		int n = 3;
		System.out.println(solution(num_list, n));
	}
}
