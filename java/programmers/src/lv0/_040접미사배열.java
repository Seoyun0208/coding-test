package lv0;

import java.util.ArrayList;
import java.util.List;

public class _040접미사배열 {
    public static String[] solution(String my_string) {
    	List<String> list = new ArrayList<String>();
    	for (int i = my_string.length() - 1; i >= 0; i--) {
    		list.add(my_string.substring(i));
    	}
    	list.sort(null);
    	String[] arr = new String[list.size()];
    	return list.toArray(arr);
    }

	public static void main(String[] args) {
		String my_string = "banana";
		System.out.println(solution(my_string));
	}
}
