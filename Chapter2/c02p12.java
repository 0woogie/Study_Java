//2장 12번
//사칙 연산을 입력받아 계산하는 프로그램
import java.util.Scanner;

public class c02p12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		double a = scanner.nextDouble();
		String s = scanner.next();
		double b = scanner.nextDouble();
		double res = 0;
		int count = 0;
		
		if(s.equals("+"))
			res = a+b;
		else if(s.equals("-"))
			res = a-b;
		else if(s.equals("*"))
			res = a*b;
		else if(s.equals("/")) {
			if(b==0)
				count++;
			else
				res = a/b;
		}
		
		if(count==0)
			System.out.println(a+""+s+""+b+"의 계산 결과는 "+res);
		else if(count==1)
			System.out.println("0으로 나눌 수 없습니다.");

		scanner.close();
	}

}
