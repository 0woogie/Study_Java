//2장 3번
//정수로 된 돈의 액수를 입력받아 50000원, 10000원, 1000원, 500원, 100원, 50원, 10원, 1원 각 몇 개로 변환되는지 출력하는 프로그램
import java.util.Scanner;

public class c02p03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		System.out.println("오만원권 " + money/50000 + "매");
		System.out.println("만원권 " + (money/10000)%5 + "매");
		System.out.println("천원권 " + (money/1000)%10 + "매");
		System.out.println("백원 " + (money/100)%10 + "개");
		System.out.println("오십원 " + (money%100)/50 + "개");
		System.out.println("십원 " + (money/10)%5 + "개");
		System.out.println("일원 " + money%10 + "개");
		scanner.close();
	}
}
