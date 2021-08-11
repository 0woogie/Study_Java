package c03;
//3장 9번
//4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수 16개를 랜덤하게 생성하여 저장한 뒤 이를 출력하는 프로그램

public class c03p09 {

	public static void main(String[] args) {
		int[][] array = new int[4][4];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10+1);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
