package lv0;

public class _005문자열정수의합 {
    public static int solution(String num_str) {
        int sum = 0;
        String[] splited = num_str.split("");
        
        for (int i = 0; i < splited.length; i++) {
            sum += Integer.parseInt(splited[i]);
        }
        return sum;
    }

	public static void main(String[] args) {
		String num_str = "123456789";
		System.out.println(solution(num_str));
	}
}
