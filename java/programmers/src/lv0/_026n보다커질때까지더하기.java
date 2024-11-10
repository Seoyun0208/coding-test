package lv0;

public class _026n보다커질때까지더하기 {
    public static int solution(int[] numbers, int n) {
    	int sum = 0;
    	for (int num : numbers) {
    		sum += num;
    		if (sum > n) {
    			break;
    		}
    	}
    	return sum;
    }

	public static void main(String[] args) {
		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n = 123;
		System.out.println(solution(numbers, n));
	}
}
