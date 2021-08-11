package c03;
//3장 16번
//가위 바위 보 게임
import java.util.Scanner;

public class c03p16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = {"가위", "바위", "보"};
		String s;
		int n;
		int result = 0;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			s = scanner.next();
			if(s.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			n = (int)(Math.random()*3);
			
			if(str[n].equals("가위")) {
				switch(s) {
					case "가위":
						result = 2;
						break;
					case "바위":
						result = 1;
						break;
					case "보":
						result = 3;
						break;
				}
			}
			else if(str[n].equals("바위")) {
				switch(s) {
					case "가위":
						result = 3;
						break;
					case "바위":
						result = 2;
						break;
					case "보":
						result = 1;
						break;
				}
			}
			else {
				switch(s) {
					case "가위":
						result = 1;
						break;
					case "바위":
						result = 3;
						break;
					case "보":
						result = 2;
						break;
				}
			}
			
			System.out.print("사용자 = " + s + ", 컴퓨터 = " + str[n] + ", ");
			if(result == 1) {
				System.out.println("사용자가 이겼습니다.");
			}
			else if(result == 2) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("사용자가 졌습니다.");
			}
		}
		scanner.close();
	}

}
