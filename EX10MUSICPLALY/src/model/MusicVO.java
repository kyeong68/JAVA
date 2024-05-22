package model;

public class MusicVO {

	
		// music의 설계도 만들기
		//vo = value object
		// 필드만들기 -> 생성자를 이용해서 초기값을 가진 객채를 만들기
		
		// 제목, 가수명, 음악길이(초) ,음악파일의 경로
	private	String title;
	private	String singer;
	private	int playtime;
	private	String musicpath;
	//생성자
	public MusicVO(String title, String singer, int playtime, String musicpath) {
	
		this.title = title;
		this.singer = singer;
		this.playtime = playtime;
		this.musicpath = musicpath;
	}

	public String getMusicpath() {
		return musicpath;
	}
	public void setMusicpath(String musicpath) {
		this.musicpath = musicpath;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public int getPlaytime() {
		return playtime;
	}
	
	
	
		
		

	}


