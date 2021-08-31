package c06;
//6장 1번
//MyPoint 클래스 작성하기

class MyPoint {
	private int x, y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		MyPoint t = (MyPoint)obj;
		if(x == t.x && y == t.y) return true;
		else return false;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class c06p01 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}
}
