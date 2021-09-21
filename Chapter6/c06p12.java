package c06;
//6장 12번
//문제 10의 갬블링 게임을 n명이 하도록 수정하기
import java.util.Scanner;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class c06p12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("갬블링 게임에 참여할 선수 숫자>>");
		int n = scanner.nextInt();
		Person[] p = new Person[n];
		String name;
		for(int i=0; i<p.length; i++) {
			System.out.print((i+1) + "번째 선수 이름>>");
			name = scanner.next();
			p[i] = new Person(name);
		}
		scanner.nextLine();
		
		int n1, n2, n3;
		int count = 0;
		while(true) {
			for(int i=0; i<p.length; i++) {
				System.out.print("[" + p[i].getName() + "]:<Enter>");
				scanner.nextLine();
				n1 = (int)(Math.random()*3+1);
				n2 = (int)(Math.random()*3+1);
				n3 = (int)(Math.random()*3+1);
				System.out.print("\t" + n1 + " " + n2 + " " + n3 + " ");
				if((n1 == n2) && (n2 == n3)) {
					System.out.println(p[i].getName() + "님이 이겼습니다!");
					count++;
					break;
				}
				else
					System.out.println("아쉽군요!");
			}
			if(count == 1)
				break;
		}
		scanner.close();
	}
}
