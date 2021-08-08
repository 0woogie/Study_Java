//3장 4번
//소문자 알파벳 하나를 입력받고 반복문 기반으로 출력하는 프로그램 
import java.util.Scanner;

public class c03p04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		char c = s.charAt(0);
		for(int i=c; i>='a'; i--) {
			for(int j='a'; j<=i; j++)
				System.out.print((char)j);
			System.out.println("");
		}
		scanner.close();
	}
}
