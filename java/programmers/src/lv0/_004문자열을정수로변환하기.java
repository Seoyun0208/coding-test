package lv0;

public class _004문자열을정수로변환하기 {
    public static int solution(String n_str) {
    	return Integer.parseInt(n_str);
    }

	public static void main(String[] args) {
		String n_str = "10";
		System.out.println(solution(n_str));
	}
}
