package lv0;

public class _015공백으로구분하기1 {
    public static String[] solution(String my_string) {
    	String[] answer = my_string.split(" ");
        return answer;
    }

	public static void main(String[] args) {
		String my_string = "i love you";
		System.out.println(solution(my_string));
	}
}
