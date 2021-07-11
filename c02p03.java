//2장 3번
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