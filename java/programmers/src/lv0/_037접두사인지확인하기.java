package lv0;

public class _037접두사인지확인하기 {
    public static int solution(String my_string, String is_prefix) {
    	// String 의 동일 여부 판별 시 == 대신 equals 사용하기!
    	int answer = 0;
    	if (my_string.length() >= is_prefix.length()) {
    		answer = my_string.substring(0, is_prefix.length()).equals(is_prefix) ? 1 : 0;
    	} 
    	return answer;
    }

	public static void main(String[] args) {
		String my_string = "banana";
		String is_prefix = "ban";
		System.out.println(solution(my_string, is_prefix));
	}
}
