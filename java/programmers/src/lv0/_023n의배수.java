package lv0;

public class _023n의배수 {
    public static int solution(int num, int n) {
    	return num % n == 0 ? 1 : 0;
    }

	public static void main(String[] args) {
		int num = 98;
		int n = 2;
		System.out.println(solution(num, n));
	}
}
