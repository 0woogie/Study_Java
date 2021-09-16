package c07;
//7장 5번
//4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장하고, 학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램
import java.util.Scanner;
import java.util.ArrayList;

class Student {
	private String name, department;
	private int num;
	private double grade;
	public Student(String name, String department, int num, double grade) {
		this.name = name;
		this.department = department;
		this.num = num;
		this.grade = grade;
	}
	String getName() {
		return name;
	}
	String getDepartment() {
		return department;
	}
	int getNum() {
		return num;
	}
	double getGrade() {
		return grade;
	}
}

public class c07p05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		ArrayList<Student> students = new ArrayList<Student>();
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String a = scanner.nextLine();
			String s[] = a.split(", ");
			String name = s[0];
			String department = s[1];
			int num = Integer.parseInt(s[2]);
			double grade = Double.parseDouble(s[3]);
			students.add(new Student(name, department, num, grade));
		}
		System.out.println("-------------------------");
		for(int i=0; i<students.size(); i++) {
			Student student = students.get(i);
			System.out.println("이름:"+student.getName());
			System.out.println("학과:"+student.getDepartment());
			System.out.println("학번:"+student.getNum());
			System.out.println("학점평균:"+student.getGrade());
			System.out.println("-------------------------");
		}
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			for(int i=0; i<students.size(); i++) {
				Student student = students.get(i);
				if(student.getName().equals(name)) {
					System.out.print(student.getName() + ", ");
					System.out.print(student.getDepartment() + ", ");
					System.out.print(student.getNum() + ", ");
					System.out.println(student.getGrade());
					break;
				}
			}
		}
		scanner.close();
	}
}
