package c05;
//5장 4번
//Converter 클래스를 상속받아 km를 mile(마일)로 변환하는 Km2Mile 클래스를 작성하기
import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.println(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		scanner.close();
	}
}

class Km2Mile extends Converter {
	Km2Mile(double ratio){
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}
}

public class c05p04 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
