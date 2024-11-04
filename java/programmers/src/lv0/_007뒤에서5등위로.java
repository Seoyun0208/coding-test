package lv0;

import java.util.Arrays;

public class _007뒤에서5등위로 {
    public static int[]  solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
        
    }

	public static void main(String[] args) {
		int[] num_list = {34, 12, 46, 50, 11, 32, 40};
		System.out.println(solution(num_list));
	}
}
