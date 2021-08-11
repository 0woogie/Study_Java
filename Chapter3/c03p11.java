package c03;
//3장 11번
//정수들의 평균을 출력하는 프로그램

public class c03p11 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println(sum/args.length);
	}

}
