package lv0;

public class _018배열에서문자열대소문자변환하기 {
    public static String[] solution(String[] strArr) {
    	String[] answer = new String[strArr.length];
    	for (int i = 0; i < strArr.length; i++) {
    		answer[i] = i % 2 == 1 ? strArr[i].toUpperCase() : strArr[i].toLowerCase();
    	}
    	return answer;
    }

	public static void main(String[] args) {
		String[] strArr = {"AAA","BBB","CCC","DDD"};
		System.out.println(solution(strArr));
	}
}
