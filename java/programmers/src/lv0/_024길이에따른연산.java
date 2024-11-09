package lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _024길이에따른연산 {
    public static int solution(int[] num_list) {
    	IntStream intStream = Arrays.stream(num_list);
    	return num_list.length > 10 ? intStream.reduce((a,b) -> a + b).getAsInt() : intStream.reduce((a,b) -> a * b).getAsInt();
    }

	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
		System.out.println(solution(num_list));
	}
}
