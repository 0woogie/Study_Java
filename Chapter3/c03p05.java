package c03;
//3장 5번
//양의 정수 10개를 입력받아 배열에 저장하고 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램
import java.util.Scanner;

public class c03p05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		System.out.print("양의 정수 10개를 입력하시오>>");
		for(int i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.print("3의 배수는 ");
		for(int i=0; i<array.length; i++) {
			if(array[i]%3 == 0)
				System.out.print(array[i] + " ");
		}
		scanner.close();
	}

}
