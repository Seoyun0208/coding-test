package lv0;

import java.util.Arrays;

public class _008뒤에서5등까지 {
    public static int[] solution(int[] num_list) {
    	Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5); 
    }

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		System.out.println(solution(num_list));
	}
}
