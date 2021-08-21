package c05;
//5장 1번
//TV를 상속받은 ColorTV 클래스 작성하기

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}


public class c05p01 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

	}
}
