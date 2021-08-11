package c03;
//3장 13번
//369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력하는 프로그램

public class c03p13 {

	public static void main(String[] args) {
		int a, b;
		for(int i=1; i<100; i++) {
			a = i/10;
			b = i%10;
			if(a==3 || a==6 || a==9) {
				System.out.print(i + " 박수 짝");
				if(b==3 || b==6 || b==9)
					System.out.println("짝");
				else
					System.out.println();
			}
			else if(b==3 || b==6 || b==9)
				System.out.println(i + " 박수 짝");
		}
	}

}
