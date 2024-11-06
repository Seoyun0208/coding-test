package lv0;

public class _013문자열바꿔서찾기 {
    public static int solution(String myString, String pat) {
    	// 자바에서 문자열은 String Pool 에 저장
    	// 문자열의 한 문자씩에 대한 메모리 주소를 가지고 있지 않아 접근 불가능
    	// 향상된 for 문의 경우 배열에서만 사용이 가능하므로 toCharArray 메소드를 사용
    	// 단, toCharArray 의 경우, 문자열에 대한 새로운 배열을 생성하므로 별도의 비용이 요구됨
        String changed = "";
        for (char str : myString.toCharArray()) {
            if (str == 'A') {
                changed += 'B';
            } else {
                changed += 'A';
            }
        }
        return changed.contains(pat) ? 1 : 0;
    }

	public static void main(String[] args) {
		String myString = "ABBAA";
		String pat = "AABB";
		System.out.println(solution(myString, pat));
	}
}
