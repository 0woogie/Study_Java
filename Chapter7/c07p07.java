package c07;
//7장 7번
//이름과 학점을 5개 입력받아 해시맵에 저장하고, 장학생 선발 기준을 입력받아 장학생 명단을 출력하는 프로그램
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class c07p07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("미래장학금관리시스템입니다.");
		HashMap<String,Double> scoreMap = new HashMap<String,Double>();
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점>> ");
			String name = scanner.next();
			double score = scanner.nextDouble();
			scoreMap.put(name, score);
		}
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double line = scanner.nextDouble();
		System.out.print("장학생 명단 : ");
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(scoreMap.get(name)>=line)
				System.out.print(name + " ");
		}
		scanner.close();
	}
}
