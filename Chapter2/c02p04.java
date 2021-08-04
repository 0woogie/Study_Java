//2장 4번
import java.util.Scanner;

public class c02p04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int midNum = 0;
		if(a>b) {
			if(a<c)
				midNum = a;
			else
				midNum = (b>c) ? b : c;
		}
		else {
			if(a>c)
				midNum = a;
			else
				midNum = (b>c) ? c : b;
		}
		System.out.println("중간 값은 " + midNum);
		scanner.close();
	}
}
