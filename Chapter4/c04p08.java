package c04;
//4장 8번
//Phone 클래스 작성하기
import java.util.Scanner;

class Phone {
	private String name, tel;
	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	String getName() {
		return name;
	}
	String getTel() {
		return tel;
	}
}

public class c04p08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>>");
		int n = scanner.nextInt();
		Phone[] phone = new Phone[n];
		for(int i=0; i<phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		int count = 0;
		while(true) {
			System.out.print("검색할 이름>>");
			String target = scanner.next();
			if(target.equals("그만"))
				break;
			count = 0;
			for(int i=0; i<phone.length; i++) {
				if(target.equals(phone[i].getName())){
					System.out.println(target + "의 번호는 " + phone[i].getTel() + " 입니다.");
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(target + " 이 없습니다.");
		}
		scanner.close();
	}
}
