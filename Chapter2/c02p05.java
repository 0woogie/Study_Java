//2장 5번
//정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하는 프로그램
import java.util.Scanner;

public class c02p05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(((a+b)>c)&&((a+c)>b)&&((b+c)>a))
			System.out.println("삼각형이 됩니다.");
		else
			System.out.println("삼각형이 되지 않습니다.");
		scanner.close();
	}
}
