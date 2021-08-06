//2장 8번
//직사각형을 구성하는 두 점 (x1,y1), (x2,y2)를 입력받아 (100,100), (200,200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램
import java.util.Scanner;

public class c02p08 {

	static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x1, y1)의 좌표를 입력하시오>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("점 (x2, y2)의 좌표를 입력하시오>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if(inRect(x1,y1,100,100,200,200)==true)
			System.out.println("두 사각형이 충돌합니다.");
		else if(inRect(x1,y2,100,100,200,200)==true)
			System.out.println("두 사각형이 충돌합니다.");
		else if(inRect(x2,y1,100,100,200,200)==true)
			System.out.println("두 사각형이 충돌합니다.");
		else if(inRect(x2,y2,100,100,200,200)==true)
			System.out.println("두 사각형이 충돌합니다.");
		else if(x1<=100 && x2>=200 && y1<=100 && y2>=200)
			System.out.println("두 사각형이 충돌합니다.");
		else
			System.out.println("두 사각형이 충돌하지 않습니다.");
		
		scanner.close();
	}

}
