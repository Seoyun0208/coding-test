package lv0;

public class _016특정한문자를대문자로바꾸기 {
    public static String solution(String my_string, String alp) {
    	return my_string.replaceAll(alp, alp.toUpperCase());
    }

	public static void main(String[] args) {
		String my_string = "programmers";
		String alp = "p";
		System.out.println(solution(my_string, alp));
	}
}
