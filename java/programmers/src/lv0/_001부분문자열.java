package lv0;

public class _001부분문자열 {
    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "aabcc";
		System.out.println(solution(str1, str2));
	}
}
