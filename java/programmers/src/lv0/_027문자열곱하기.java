package lv0;

public class _027문자열곱하기 {
    public static String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }

	public static void main(String[] args) {
		String my_string = "string";
		int k = 3;
		System.out.println(solution(my_string, k));
	}
}
