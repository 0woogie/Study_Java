package app;
import base.Shape;
import derived.Circle;
//6장 4번
//Shape 클래스는 base 패키지에, Circle 클래스는 derived 패키지에, c06p04 클래스는 app 패키지로 분리 작성하기

public class c06p04 {
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}
