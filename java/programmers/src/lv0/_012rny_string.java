package lv0;

public class _012rny_string {
    public static String solution(String rny_string) {
    	return rny_string.replaceAll("m", "rn");
    }

	public static void main(String[] args) {
		String rny_string = "programmers";
		System.out.println(solution(rny_string));
	}
}
