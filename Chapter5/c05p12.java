package c05;
//5장 12번
//"삽입", "삭제", "모두 보기", "종료"의 4가지 그래픽 편집 기능을 가진 클래스 GraphicEditor을 작성하기
import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() { next = null; }
	public void setNext(Shape obj) { next = obj; }
	public Shape getNext() { return next; }
	public abstract void draw();
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor {
	private Shape head, tail;
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		int count = 0;
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int n = scanner.nextInt();
			switch(n) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int m = scanner.nextInt();
				insert(m);
				break;
			case 2:
				System.out.print("삭제할 도형의 위치>>");
				int index = scanner.nextInt();
				delete(index);
				break;
			case 3:
				show();
				break;
			case 4:
				count++;
				break;
			default:
				System.out.println("다시 입력하세요.");
			}
			
			if(count == 1) {
				System.out.println("beauty을 종료합니다.");
				break;
			}
			
		}
		scanner.close();
	}
	
	void insert(int m) {
		Shape cur;
		switch(m) {
		case 1:
			cur = new Line();
			break;
		case 2:
			cur = new Rect();
			break;
		case 3:
			cur = new Circle();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		if(head == null) {
			head = cur;
			tail = cur;
		}
		else {
			tail.setNext(cur);
			tail = cur;
		}
		return;
	}
	
	void delete(int index) {
		Shape cur = head;
		Shape temp = head;
		if(head == null) {
			System.out.println("삭제할 수 없습니다.");
			return;
		}

		if(index == 1) {
			if(cur.getNext() == null) {
				head = null;
				tail = null;
				return;
			}
			else {
				head = cur.getNext();
				return;
			}
		}
		else {
			for(int i=1;i<index;i++) {
				temp=cur;
				cur=cur.getNext();
				if(cur==null) {
					System.out.println("삭제할 수 없습니다.");
					return;
				}
			}
			if(cur==tail) {
				tail=temp;
				tail.setNext(null);
			}
			else {
				temp.setNext(cur.getNext());
			}
		}
	}
	
	void show() {
		Shape cur = head;
		while(cur != null) {
			cur.draw();
			cur = cur.getNext();
		}
	}
}

public class c05p12 {
	public static void main(String[] args) {
		GraphicEditor beauty = new GraphicEditor();
		beauty.run();
	}
}