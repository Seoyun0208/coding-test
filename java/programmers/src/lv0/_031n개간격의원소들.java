package lv0;

import java.util.ArrayList;
import java.util.List;

public class _031n개간격의원소들 {
    public static int[] solution(int[] num_list, int n) {
    	// 참조형 List 를 배열로 변환할 때만 toArray() 바로 사용 가능
    	List<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < num_list.length; i++) {
    		if (i % n == 0) {
    			list.add(num_list[i]);
    		}
    	}
    	return list.stream().mapToInt(i -> i).toArray();
    }

	public static void main(String[] args) {
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;
		System.out.println(solution(num_list, n));
	}
}
