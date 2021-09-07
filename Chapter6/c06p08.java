package c06;
//6장 8번
//문자열을 입력받아 한 글자씩 회전시켜 모두 출력하는 프로그램
import java.util.Scanner;

public class c06p08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		String s = scanner.nextLine();
		String a, b;
		int length = s.length();
		for(int i=0; i<length; i++) {
			a = s.substring(1);
			b = s.substring(0, 1);
			s = a.concat(b);
			System.out.println(s);
		}
		scanner.close();
	}
}
