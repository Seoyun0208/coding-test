package lv0;

public class _020대문자로바꾸기 {
    public static String solution(String myString) {
    	return myString.toUpperCase();
    }

	public static void main(String[] args) {
		String myString = "aBcDeFg";
		System.out.println(solution(myString));
	}
}
