package lv0;

public class _039접미사인지확인하기 {
    public static int solution(String my_string, String is_suffix) {
    	// String 의 동일 여부 판별 시 == 대신 equals 사용하기!
    	int answer = 0;
    	if (my_string.length() >= is_suffix.length()) {
    		answer = my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix) ? 1 : 0;
    	} 
    	return answer;
    }

	public static void main(String[] args) {
		String my_string = "banana";
		String is_suffix = "ana";
		System.out.println(solution(my_string, is_suffix));
	}
}
