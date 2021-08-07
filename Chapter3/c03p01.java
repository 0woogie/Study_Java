//3장 1번
//0~99 사이의 짝수 합을 출력하는 프로그램

public class c03p01 {

	public static void main(String[] args) {
		int sum=0, i=0;
		while(i < 100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
	}

}
