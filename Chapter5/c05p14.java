package c05;
//5장 14번
//문제 13번의 Shape 인터페이스를 구현하는 클래스 Oval, Rect를 추가 작성하여 전체 프로그램 완성하기

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

class Oval implements Shape {
	private int x, y;
	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void draw() {
		System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
	}
	public double getArea() {
		return (x/2)*(y/2)*PI;
	}
}

class Rect implements Shape {
	private int x, y;
	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void draw() {
		System.out.println(x + "x" + y + "크기의 사각형 입니다.");
	}
	public double getArea() {
		return x*y;
	}
}

public class c05p14 {
	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}
