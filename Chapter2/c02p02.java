//2장 2번
//2자리의 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램
import java.util.Scanner;

public class c02p02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = scanner.nextInt();
		if((num<10)||(num>99)) {
			System.out.println("두자리수 정수가 아닙니다.");
		}else {
			if((num/10)==(num%10))
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			else
				System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		scanner.close();
	}
}
