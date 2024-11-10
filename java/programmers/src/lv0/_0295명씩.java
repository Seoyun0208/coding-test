package lv0;

import java.util.ArrayList;
import java.util.List;

public class _0295명씩 {
    public static String[] solution(String[] names) {
    	List<String> namesList = new ArrayList<String>();
    	for (int i = 0; i < names.length; i++) {
    		if(i % 5 == 0) namesList.add(names[i]);
    	}
    	return namesList.toArray(new String[namesList.size()]);
    }

	public static void main(String[] args) {
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		System.out.println(solution(names));
	}
}
