package c07;
//7장 8번
//고객의 이름과 포인트 점수를 관리하는 프로그램을 해시맵을 이용하여 작성하기
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class c07p08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("** 포인트 관리 프로그램입니다 **");
		HashMap<String,Integer> customers = new HashMap<String,Integer>();
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			int point = scanner.nextInt();
			if(customers.containsKey(name)) {
				point += customers.get(name);
				customers.put(name, point);
			}
			else {
				customers.put(name, point);
			}
			Set<String> keys = customers.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()) {
				String customer = it.next();
				System.out.print("(" + customer + "," + customers.get(customer) + ")");
			}
			System.out.println();
		}
		scanner.close();
	}
}
