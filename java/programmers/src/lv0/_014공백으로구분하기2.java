package lv0;

public class _014공백으로구분하기2 {
    public static String[] solution(String my_string) {
    	// 자바 에서는 '로 enclosed 된 것은 character literals 이고,
    	// "로 enclosed 된 것은 string literals 임 
    	String[] answer = my_string.trim().split("\\s+");
        return answer;
    }

	public static void main(String[] args) {
		String my_string = " i    love  you";
		System.out.println(solution(my_string));
	}
}
