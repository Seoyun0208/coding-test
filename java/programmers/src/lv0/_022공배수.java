package lv0;

public class _022공배수 {
    public static int solution(int number, int n, int m) {
    	return number % n != 0 || number % m != 0 ? 0 : 1;
    }

	public static void main(String[] args) {
		int number = 60;
		int n = 2;
		int m = 3;
		System.out.println(solution(number, n, m));
	}
}
