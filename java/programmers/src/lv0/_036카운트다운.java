package lv0;

import java.util.ArrayList;
import java.util.List;

public class _036카운트다운 {
    public static int[] solution(int start_num, int end_num) {
    	List<Integer> list = new ArrayList<Integer>();
        for (int i = start_num; i >= end_num; i--) {
        	list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

	public static void main(String[] args) {
		int start_num = 10;
		int end_num = 3;
		System.out.println(solution(start_num, end_num));
	}
}
