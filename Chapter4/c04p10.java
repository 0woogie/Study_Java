package c04;
//4장 10번
//Dictionary 클래스 작성하기
import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word))
				return eng[i];
		}
		return null;
	}
}

public class c04p10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		String target, result;
		while(true) {
			System.out.print("한글 단어?");
			target = scanner.next();
			if(target.equals("그만"))
				break;
			result = Dictionary.kor2Eng(target);
			if(result != null)
				System.out.println(target + "은 " + result);
			else
				System.out.println(target + "는 저의 사전에 없습니다.");
		}
		scanner.close();
	}
}
