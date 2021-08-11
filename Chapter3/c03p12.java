package c03;
//3장 12번
//명령행 인자 중에서 정수만 골라서 합을 출력하는 프로그램

public class c03p12 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e) {
				continue;
			}
		}
		System.out.println(sum);
	}

}
