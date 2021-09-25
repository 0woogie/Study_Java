package c07;
//7장 9번
//IStack<T> 인터페이스를 구현하는 MyStack<T> 클래스 작성하기
import java.util.ArrayList;

interface IStack<T> {
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	ArrayList<T> a = null;
	MyStack() {
		a = new ArrayList<T>();
	}
	@Override
	public T pop() {
		if(a.size() == 0)
			return null;
		else
			return a.remove(0); //맨 앞 요소 pop하기
	}
	@Override
	public boolean push(T ob) {
		a.add(0, ob); //맨 앞에 요소 push하기
		return true;
	}
	
}

public class c07p09 {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i=0; i<10; i++) stack.push(i);
		while(true) {
			Integer n = stack.pop();
			if(n == null) break;
			System.out.print(n + " ");
		}
	}
}
