//3장 3번
//정수를 입력받고 *를 출력하는 프로그램
import java.util.Scanner;

public class c03p03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오>>");
		int n = scanner.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println("");
		}
		scanner.close();
	}
	
}
