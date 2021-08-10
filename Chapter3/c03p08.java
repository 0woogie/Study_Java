package c03;
//3장 8번
//배열의 길이를 키보드로 입력받고 해당 배열에 1에서 100까지의 중복되지 않는 정수를 랜덤하게 삽입한 뒤 이를 출력하는 프로그램
import java.util.Scanner;

public class c03p08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*100+1);
			for(int j=0; j<i; j++) {
				if(array[j] == array[i]) {
					i--;
					break;
				}
			}
		}
		
		//한 행에 10개씩 출력
		int count = 0;
		int x = 0;
		while(true) {
			for(int i=0; i<10; i++) {
				if(x == array.length) {
					count++;
					break;
				}
				System.out.print(array[x] + " ");
				x++;
			}
			if(count == 1)
				break;
			System.out.println();
		}
		
		//간단하게 한 행에 10개씩 출력할 수 있지만 i가 0일때 불필요한 엔터 한 번을 하고 시작한다는 단점이 있음
		/*for(int i=0; i<array.length; i++) {
			if(i%10 == 0) {
				System.out.println();	
			}
			System.out.print(array[i] + " ");
		}*/
		
		scanner.close();
	}

}
