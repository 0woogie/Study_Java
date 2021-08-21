package c05;
//5장 2번
//ColorTV를 상속받은 IPTV 클래스 작성하기

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

class IPTV extends ColorTV {
	private String address;
	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}
	@Override
	void printProperty() {
		System.out.print("나의 IPTV는 " + address + " 주소의 ");
		super.printProperty();
	}
}

public class c05p02 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
