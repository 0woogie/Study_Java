package c03;
//3장 6번
//2장 3번과 유사한 문제, 알고리즘을 개선시켜보자.
import java.util.Scanner;

public class c03p06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		for(int i=0; i<unit.length; i++) {
			if(money/unit[i] == 0)
				continue;
			System.out.println(unit[i] + "원 짜리 : " + money/unit[i] + "개");
			money = money%unit[i];
		}
		scanner.close();
	}

}
