package c06;
//6장 11번
//StringBuffer 클래스를 활용하여 문자열을 수정하는 프로그램 만들기
import java.util.Scanner;

public class c06p11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		String s = scanner.nextLine();
		StringBuffer sb = new StringBuffer(s);
		while(true) {
			System.out.print("명령: ");
			String command = scanner.next();
			if(command.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			String[] tokens = command.split("!");
			if(tokens.length != 2) {
				System.out.println("잘못된 명령입니다!");
			}
			else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다!");
					continue;
				}
				
				int index = sb.indexOf(tokens[0]);
				if(index == -1) { // not found!
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				sb.replace(index, index+tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}
	}
}
