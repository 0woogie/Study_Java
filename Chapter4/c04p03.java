package c04;
//4장 3번
//노래 한 곡을 나타내는 Song 클래스 작성하기

class Song {
	private String title, artist, country;
	private int year;
	
	Song(){	}
	
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

public class c04p03 {
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
	}
}
