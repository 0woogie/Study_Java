package c07;
//7장 4번
//Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램
import java.util.Scanner;
import java.util.Vector;

public class c07p04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int n = scanner.nextInt();
			if(n == 0)
				break;
			v.add(n);
			int sum = 0;
			for(int i=0; i<v.size(); i++) {
				int rainfall = v.get(i);
				System.out.print(rainfall + " ");
				sum += rainfall;
			}
			System.out.println();
			System.out.println("현재 평균 " + sum/v.size());
		}
		scanner.close();
	}
}
