package c07;
//7장 6번
//도시 이름, 위도, 경도 정보를 가진 Location 클래스를 작성하고, 도시 이름을 '키'로 하는 HashMap<String, Location> 컬렉션 작성하기
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

class Location {
	private String name;
	private int lon, lat;
	public Location(String name, int lon, int lat) {
		this.name = name;
		this.lon = lon;
		this.lat = lat;
	}
	public void show() {
		System.out.println(name + "  " + lon + "  " + lat);
	}
}

public class c07p06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("도시,경도,위도를 입력하세요.");
		HashMap<String,Location> locations = new HashMap<String,Location>();
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String a = scanner.nextLine();
			String s[] = a.split(", ");
			String name = s[0];
			int lon = Integer.parseInt(s[1]);
			int lat = Integer.parseInt(s[2]);
			locations.put(name, new Location(name, lon, lat));
		}
		System.out.println("-------------------------");
		Set<String> keys = locations.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			locations.get(name).show();
		}
		System.out.println("-------------------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			if(locations.containsKey(name)) {
				locations.get(name).show();
			}
			else {
				System.out.println(name + "는 없습니다.");
			}
		}
		scanner.close();
	}
}
