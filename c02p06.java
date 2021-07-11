//2장 6번
import java.util.Scanner;

public class c02p06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		int a = num/10;
		int b = num%10;
		if(a==3||a==6||a==9) {
			System.out.print("박수짝");
			if(b==3||b==6||b==9)
				System.out.println("짝");
		}
		else {
			if(b==3||b==6||b==9)
				System.out.print("박수짝");
		}
		scanner.close();
	}
}
