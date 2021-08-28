package c05;
//5장 13번
//도형의 구성을 묘사하는 인터페이스와 이를 구현하는 클래스 작성하기

interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---다시 그립니다. ");
		draw();
	}
}

class Circle implements Shape {
	private int r;
	public Circle(int r) {
		this.r = r;
	}
	public void draw() {
		System.out.println("반지름이 " + r + "인 원입니다.");
	}
	public double getArea() {
		return r*r*PI;
	}
}

public class c05p13 {
	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
