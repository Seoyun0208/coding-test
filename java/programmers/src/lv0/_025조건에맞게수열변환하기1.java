package lv0;

public class _025조건에맞게수열변환하기1 {
    public static int[] solution(int[] arr) {
    	for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else if(arr[i] < 50 && arr[i] % 2 == 1){
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		System.out.println(solution(arr));
	}
}
