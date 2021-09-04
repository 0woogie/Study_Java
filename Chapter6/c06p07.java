package c06;
//6장 7번
//공백으로 분리된 어절이 한 라인에 몇 개 들어 있는지 출력하는 프로그램
import java.util.Scanner;
import java.util.StringTokenizer;

public class c06p07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println("어절 개수는 " + st.countTokens());
		}
		scanner.close();
	}
}
