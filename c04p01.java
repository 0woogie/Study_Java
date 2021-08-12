package c04;
//4장 1번
//TV 클래스 작성하기

class TV {
	private String manufacturer;
	private int year;
	private int size;
	
	TV(String manufacturer, int year, int size){
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.println(manufacturer + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
}

public class c04p01 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
