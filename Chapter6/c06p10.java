package c06;
//6장 10번
//갬블링 게임
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

public class c06p10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.print("1번째 선수 이름>>");
		name = scanner.next();
		Person p1 = new Person(name);
		System.out.print("2번째 선수 이름>>");
		name = scanner.next();
		Person p2 = new Person(name);
		scanner.nextLine();
		
		int n1, n2, n3;
		while(true) {
			System.out.print("[" + p1.getName() + "]:<Enter>");
			scanner.nextLine();
			n1 = (int)(Math.random()*3+1);
			n2 = (int)(Math.random()*3+1);
			n3 = (int)(Math.random()*3+1);
			System.out.print("\t" + n1 + " " + n2 + " " + n3 + " ");
			if((n1 == n2) && (n2 == n3)) {
				System.out.println(p1.getName() + "님이 이겼습니다!");
				break;
			}
			else
				System.out.println("아쉽군요!");
			
			System.out.print("[" + p2.getName() + "]:<Enter>");
			scanner.nextLine();
			n1 = (int)(Math.random()*3+1);
			n2 = (int)(Math.random()*3+1);
			n3 = (int)(Math.random()*3+1);
			System.out.print("\t" + n1 + " " + n2 + " " + n3 + " ");
			if((n1 == n2) && (n2 == n3)) {
				System.out.println(p2.getName() + "님이 이겼습니다!");
				break;
			}
			else
				System.out.println("아쉽군요!");
		}
		scanner.close();
	}
}
