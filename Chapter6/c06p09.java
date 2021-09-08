package c06;
//6장 9번
//철수와 컴퓨터의 가위바위보 게임

import java.util.Random;
import java.util.Scanner;
 
class rsp{
	String n;
	String name;
	public rsp(String name) {
		this.name=name;
	}
	public void Set(int op) {
		if(op==1) {
			n="가위";
		}
		else if(op==2) {
			n="바위";
		}
		else {
			n="보";
		}
	}
	public void compare(rsp b) {
		if(n.equals("가위")) {
			if(b.n.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			else if(b.n.equals("바위")) {
				System.out.println(b.name+"가 이겼습니다.");
			}
			else {
				System.out.println(name+"가 이겼습니다.");
			}
		}
		else if(n.equals("바위")) {
			if(b.n.equals("가위")) {
				System.out.println(name+"가 이겼습니다.");
			}
			else if(b.n.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println(b.name+"가 이겼습니다.");
			}
		}
		else {
			if(b.n.equals("가위")) {
				System.out.println(b.name+"가 이겼습니다.");
			}
			else if(b.n.equals("바위")) {
				System.out.println(name+"가 이겼습니다.");
			}
			else {
				System.out.println("비겼습니다.");
			}
		}
	}
	public String toString() {
		return name+"("+n+")";
	}
}
 
public class c06p09 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		rsp cs=new rsp("철수");
		rsp com=new rsp("컴퓨터");
		Random r=new Random();
		r.setSeed(System.currentTimeMillis());
		while(true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내가(4)]>>");
			int op=sc.nextInt();
			if(op==4) {
				break;
			}
			cs.Set(op);
			com.Set(r.nextInt(3)+1);
			System.out.println(cs+" : "+com);
			cs.compare(com);
		}
	}
 
}
