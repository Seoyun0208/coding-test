package lv0;

public class _038문자열의앞의n글자 {
    public static String solution(String my_string, int n) {
    		return my_string.substring(0, n);
    }

	public static void main(String[] args) {
		String my_string = "ProgrammerS123";
		int n = 11;
		System.out.println(solution(my_string, n));
	}
}
