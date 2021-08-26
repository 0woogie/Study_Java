package c05;
//5장 11번
//추상클래스 Calc와 이를 상속받는 Add, Sub, Mul, Div 클래스 작성하기
import java.util.Scanner;

abstract class Calc {
	int a, b;
	abstract void setValue(int a, int b);
	abstract int calculate();
}

class Add extends Calc {
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a+b;
	}
}
class Sub extends Calc {
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a-b;
	}
}
class Mul extends Calc {
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a*b;
	}
}
class Div extends Calc {
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a/b;
	}
}

public class c05p11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char op = scanner.next().charAt(0);
		Calc calc;
		switch(op) {
		case '+':
			calc = new Add();
			break;
		case '-':
			calc = new Sub();
			break;
		case '*':
			calc = new Mul();
			break;
		case '/':
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			calc = new Div();
			break;
		default:
			System.out.println("입력된 연산자가 적절하지 않습니다.");
			return;
		}
		calc.setValue(a, b);
		System.out.println(calc.calculate());
		scanner.close();
	}
}
