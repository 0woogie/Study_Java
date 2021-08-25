package c05;
//5장 10번
//키와 값을 하나의 아이템으로 저장하고 검색 수정이 가능한 추상 클래스를 구현하는 Dictionary 클래스 작성하기

abstract class PairMap {
	protected String[] keyArray;
	protected String[] valueArray;
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap {
	private int len;
	
	Dictionary(int n) {
		keyArray = new String[n];
		valueArray = new String[n];
		len = 0;
	}
	
	void put(String key, String value) {
		for(int i=0; i<len; i++) {
			if(keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}
		if(len<keyArray.length) {
			keyArray[len] = key;
			valueArray[len] = value;
			len++;
		}
		else {
			System.out.println("더 이상 값을 저장할 수 없습니다.");
		}
	}
	
	String get(String key) {
		for(int i=0; i<len; i++) {
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		return null;
	}
	
	String delete(String key) {
		String value = null;
		for(int i=0; i<len; i++) {
			if(keyArray[i].equals(key)) {
				value = valueArray[i];
				for(int j=i; j<len-1; j++) {
					keyArray[j] = keyArray[j+1];
					valueArray[j] = valueArray[j+1];
				}
				len--;
				break;
			}
		}
		keyArray[len] = "";
		valueArray[len] = "";
		return value;
	}
	
	int length() {
		return len;
	}
}

public class c05p10 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}
