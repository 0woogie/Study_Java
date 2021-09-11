package c07;
//7장 2번
//ArrayList를 이용하여 학점을 저장하고 평균을 출력하는 프로그램
import java.util.Scanner;
import java.util.ArrayList;

public class c07p02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		ArrayList<Character> a = new ArrayList<Character>();
		
		for(int i=0; i<6; i++) {
			char c = scanner.next().charAt(0);
			a.add(c);
		}
		
		double sum = 0;
		for(int i=0; i<6; i++) {
			switch(a.get(i)) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
		System.out.println(sum/a.size());
		scanner.close();
	}
}
