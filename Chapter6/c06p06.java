package c06;
//6장 6번
//경과시간을 맞추는 게임을 작성하기
import java.util.Calendar;
import java.util.Scanner;

class Player {
	String name;
	int record;
	public Player(String name) {
		this.name = name;
	}
	public void pressEnter() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(name + " 시작 <Enter>키>>");
		scanner.nextLine();
		Calendar now = Calendar.getInstance();
		int second1 = now.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + second1);
		System.out.print("10초 예상 후 <Enter>키>>");
		scanner.nextLine();
		now = Calendar.getInstance();
		int second2 = now.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + second2);
		record = (second2 > second1) ? (second2 - second1) : (second2 + 60 - second1);
	}
}

public class c06p06 {
	public static void main(String[] args) {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		Player a = new Player("황기태");
		Player b = new Player("이재문");
		a.pressEnter();
		b.pressEnter();
		String winner;
		if(Math.abs(10-a.record) < Math.abs(10-b.record)) {
			winner = a.name;
		}
		else {
			winner = b.name;
		}
		System.out.println(a.name + "의 결과 " + a.record + ", " + b.name + "의 결과 " + b.record + ", 승자는 " + winner);
	}
}
