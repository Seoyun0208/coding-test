package lv0;

public class _002부분문자열인지확인하기 {
    public static int solution(String my_string, String target) {
    	return my_string.contains(target) ? 1 : 0;
    }

	public static void main(String[] args) {
		String my_string = "banana";
		String target = "ana";
		System.out.println(solution(my_string, target));
	}
}
