package lv0;


public class _009배열의길이에따라다른연산하기 {
    public static int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 0) {
        	for(int i = 0; i < arr.length; i++) {
        		if (i % 2 == 1) {
        			arr[i] += n;
        		}
        	}
        } else {
        	for(int i = 0; i < arr.length; i++) {
        		if (i % 2 == 0) {
        			arr[i] += n;
        		}
        	}
        }
        return arr;
       
    }

	public static void main(String[] args) {
		int[] arr = {444, 555, 666, 777};
		int n = 100;
		System.out.println(solution(arr, n));
	}
}
