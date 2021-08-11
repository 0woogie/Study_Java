package c03;
//3장 14번
//과목이름을 입력받아 점수를 출력하는 프로그램
import java.util.Scanner;

public class c03p14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		int count = 0;
		while(true) {
			count = 0;
			System.out.print("과목 이름>>");
			String s = scanner.next();
			if(s.equals("그만"))
				break;
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(s)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println("없는 과목입니다.");
			}
		}
		scanner.close();
	}

}
