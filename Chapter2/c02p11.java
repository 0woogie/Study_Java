//2장 11번
//입력받는 숫자에 따라 사계절 중 하나를 출력하는 프로그램
import java.util.Scanner;

public class c02p11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int n = scanner.nextInt();
		if(n>=3 && n<=5)
			System.out.println("봄");
		else if(n>=6 && n<=8)
			System.out.println("여름");
		else if(n>=9 && n<=11)
			System.out.println("가을");
		else if(n==1 || n==2 || n==12)
			System.out.println("겨울");
		else
			System.out.println("잘못입력");
		scanner.close();
	}

}
