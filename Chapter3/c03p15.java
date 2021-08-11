package c03;
//3장 15번
//실수가 입력되면 정수를 다시 입력하도록 예외 처리 코드가 작성된 곱하기 프로그램
import java.util.Scanner;
import java.util.InputMismatchException;

public class c03p15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine();
			}
		}
		scanner.close();
	}

}
