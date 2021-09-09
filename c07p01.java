package c07;
//7장 1번
//-1이 입력될 때까지 양의 정수를 입력받아 벡터에 저장하고 벡터를 검색하여 가장 큰 수를 출력하는 프로그램
import java.util.Scanner;
import java.util.Vector;

public class c07p01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1)
				break;
			if(n > 0)
				v.add(n);
		}
		int max = v.get(0);
		for(int i=1; i<v.size(); i++) {
			if(max < v.get(i))
				max = v.get(i);
		}
		System.out.println("가장 큰 수는 " + max);
		scanner.close();
	}
}
