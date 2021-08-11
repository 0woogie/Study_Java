package c03;
//3장 10번
//4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하여 임의의 위치에 삽입하는 프로그램

public class c03p10 {

	public static void main(String[] args) {
		int[][] array = new int[4][4];
		int count = 0;
		int row, col;
		while(count<10) {
			row = (int)(Math.random()*4);
			col = (int)(Math.random()*4);
			if(array[row][col] == 0) {
				array[row][col] = (int)(Math.random()*10+1);
				count++;
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
