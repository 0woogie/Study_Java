package c04;
//4장 12번
//콘서트 예약 시스템
import java.util.Scanner;

class Concert {
	private String[] seat = new String[10];
	Scanner sc;
	Concert() {
		sc = new Scanner(System.in);
		for(int i=0; i<seat.length; i++)
			seat[i] = "---";
	}
	void reserve() {
		String name;
		int number;
		System.out.print("이름>>");
		name = sc.next();
		while(true) {
			System.out.print("번호>>");
			number = sc.nextInt();
			if(seat[number-1].equals("---"))
				break;
			System.out.println("이미 예약된 좌석입니다. 다시 입력하세요.");
		}
		seat[number-1] = name;
	}
	void show() {
		for(int i=0; i<seat.length; i++)
			System.out.print(seat[i] + " ");
		System.out.println();
	}
	void cancel() {
		String name;
		while(true) {
			System.out.print("이름>>");
			name = sc.next();
			for(int i=0; i<seat.length; i++) {
				if(seat[i].equals(name)) {
					seat[i] = "---";
					return;
				}
			}
			System.out.println("없는 사람입니다. 다시 입력하세요.");
		}
	}
}

public class c04p12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Concert[] concert = new Concert[3];
		for(int i=0; i<concert.length; i++)
			concert[i] = new Concert();
		String[] grade = {"S", "A", "B"};
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		int count = 0;
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int n = scanner.nextInt();
			
			switch(n) {
			case 1:
				int m;
				while(true) {
					System.out.print("좌석구분 S(1), A(2), B(3)>>");
					m = scanner.nextInt();
					if(m<1 || m>3) {
						System.out.println("없는 번호입니다. 다시 시도하십시오.");
						continue;
					}
					break;
				}
				System.out.print(grade[m-1] + ">> ");
				concert[m-1].show();
				concert[m-1].reserve();
				break;
			case 2:
				for(int i=0; i<concert.length; i++) {
					System.out.print(grade[i] + ">> ");
					concert[i].show();
				}
				System.out.println("<<<조회를 완료하였습니다.>>>");
				break;
			case 3:
				int x;
				while(true) {
					System.out.print("좌석구분 S:1, A:2, B:3>>");
					x = scanner.nextInt();
					if(x<1 || x>3) {
						System.out.println("없는 번호입니다. 다시 시도하십시오.");
						continue;
					}
					break;
				}
				System.out.print(grade[x-1] + ">> ");
				concert[x-1].show();
				concert[x-1].cancel();
				break;
			case 4:
				count++;
				break;
			default:
				System.out.println("없는 번호입니다. 다시 시도하십시오.");
			}
			
			if(count == 1)
				break;
		}
		scanner.close();
	}
}