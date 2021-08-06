//2장 9번
//원의 중심을 나타내는 한 점과 반지름을 입력받고 다른 점 (x,y)를 입력받아 이 점이 원의 내부에 있는지 판별하는 프로그램
import java.util.Scanner;

public class c02p09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.print("점 입력>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		if(Math.sqrt((x-a)*(x-a)+(y-b)*(y-b)) < r)
			System.out.println("점 ("+x+","+y+")는 원 안에 있다.");
		else
			System.out.println("점 ("+x+","+y+")는 원 안에 없다.");
		scanner.close();
	}

}
