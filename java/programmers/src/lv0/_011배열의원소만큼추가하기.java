package lv0;

import java.util.ArrayList;

public class _011배열의원소만큼추가하기 {
    public static int[] solution(int[] arr) {
    	// javascript 와 다르게 배열에 바로 요소 추가 불가
    	// 배열을 ArrayList 로 변환 후 요소 추가 -> ArrayList를 배열로 변환
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : arr) {
        	for (int i = 0; i < num; i++) {
        		list.add(num);
        	}
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
       return answer;
    }

	public static void main(String[] args) {
		int[] arr = {5, 1, 4};
		System.out.println(solution(arr));
	}
}
