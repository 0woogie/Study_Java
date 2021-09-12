package c07;
//7장 3번
//나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 프로그램
import java.util.Scanner;
import java.util.HashMap;

public class c07p03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String nation = scanner.next();
			if(nation.equals("그만"))
				break;
			int population = scanner.nextInt();
			nations.put(nation, population);
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String nation = scanner.next();
			if(nation.equals("그만"))
				break;
			if(nations.containsKey(nation)) {
				System.out.println(nation + "의 인구는 " + nations.get(nation));
			}
			else {
				System.out.println(nation + " 나라는 없습니다.");
			}
		}
		scanner.close();
	}
}
