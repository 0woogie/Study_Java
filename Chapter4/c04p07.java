package c04;
//4장 7번
//한 달의 할 일을 표현하는 MonthSchedule 클래스 작성하기
import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	private Day[] day;
	private Scanner scanner;
	MonthSchedule(int n){
		day = new Day[n];	
		for(int i=0; i<day.length; i++)
			day[i] = new Day();
		scanner = new Scanner(System.in);
	}
	private void input() {
		System.out.print("날짜(1~30)?");
		int m = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String s = scanner.next();
		day[m-1].set(s);
	}
	private void view() {
		System.out.print("날짜(1~30)?");
		int m = scanner.nextInt();
		System.out.print(m + "일의 할 일은 ");
		day[m-1].show();
	}
	private void finish() {
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int n = scanner.nextInt();
			switch(n) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return;
			default: System.out.println("올바른 숫자를 입력하세요.");
			}
			System.out.println();
		}
	}
}

public class c04p07 {
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}