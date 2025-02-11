package lv0;

import java.util.ArrayList;
import java.util.List;

public class _028할일목록 {
    public static String[] solution(String[] todo_list, boolean[] finished) {
    	List<String> answerList = new ArrayList<String>();
    	for (int i = 0; i < finished.length; i++) {
    		if (!finished[i]) {
    			answerList.add(todo_list[i]);
    		}
    	}
    	String[] answer = new String[answerList.size()];
    	return answerList.toArray(answer);
    }

	public static void main(String[] args) {
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		System.out.println(solution(todo_list, finished));
	}
}
