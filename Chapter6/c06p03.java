package main;
import etc.Calc;
//6장 3번
//Calc 클래스는 etc 패키지에, c06p03 클래스는 main 패키지로 분리 작성하기

public class c06p03 {
	public static void main(String[] args) {
		Calc c = new Calc(10, 20);
		System.out.println(c.sum());
	}
}
