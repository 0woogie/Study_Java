package c04;
//4장 9번
//2개의 static 가진 ArrayUtil 클래스 작성하기

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		for(int i=0; i<a.length; i++)
			c[i] = a[i];
		for(int i=0; i<b.length; i++)
			c[i+a.length] = b[i];
		return c;
		
	}
	public static void print(int[] a) {
		System.out.print("[ ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("]");
	}
}

public class c04p09 {
	public static void main(String[] args) {
		int[] array1 = {1, 5, 7, 9};
		int[] array2 = {3, 6, -1, 100, 77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
