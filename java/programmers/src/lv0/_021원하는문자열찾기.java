package lv0;

public class _021원하는문자열찾기 {
    public static int solution(String myString, String pat) {
    	return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }

	public static void main(String[] args) {
		String myString = "AbCdEfG";
		String pat = "aBc";
		System.out.println(solution(myString, pat));
	}
}
