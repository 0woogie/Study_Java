package c03;
//3장 7번
//1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하고 그 숫자들과 평균을 출력하는 프로그램

public class c03p07 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*10 + 1);
			sum += array[i];
		}
		System.out.print("랜덤한 정수들 : ");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
		System.out.println("평균은 " + (double)sum/array.length);
	}

}
