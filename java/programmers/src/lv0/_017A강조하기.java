package lv0;

public class _017A강조하기 {
    public static String solution(String myString) {
    	return myString.toLowerCase().replaceAll("a", "A");
    }

	public static void main(String[] args) {
		String myString = "abstract algebra";
		System.out.println(solution(myString));
	}
}
