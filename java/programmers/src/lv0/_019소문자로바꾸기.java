package lv0;

public class _019소문자로바꾸기 {
    public static String solution(String myString) {
    	return myString.toLowerCase();
    }

	public static void main(String[] args) {
		String myString = "aBcDeFg";
		System.out.println(solution(myString));
	}
}
