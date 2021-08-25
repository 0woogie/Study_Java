package c05;
//5장 9번
//Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스 구현하기
import java.util.Scanner;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack {
	private int len, cap;
	String[] string;
	StringStack(int cap) {
		this.cap = cap;
		this.len = 0;
		string = new String[cap];
	}
	public int length() {
		return len;
	}
	public int capacity() {
		return cap;
	}
	public String pop() {
		if(len>0)
			return string[--len];
		else
			return null;
	}
	public boolean push(String val) {
		if(len < cap) {
			string[len] = val;
			len++;
			return true;
		}
		else
			return false;
	}
}

public class c05p09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int cap = scanner.nextInt();
		StringStack s = new StringStack(cap);
		String val;
		while(true) {
			System.out.print("문자열 입력 >> ");
			val = scanner.next();
			if(val.equals("그만"))
				break;
			if(!s.push(val))
				System.out.println("스택이 꽉 차서 푸시 불가!");
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = s.length();
		for(int i=0; i<len; i++)
			System.out.print(s.pop() + " ");
		scanner.close();
	}
}
