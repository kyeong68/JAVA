package Maincontroller;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import javazoom.jl.player.MP3Player;
import model.MusicVO;

public class Maincontroller {

	//controller의 역할 : 자료조작과 계산을 수행하는 비지니스 로직.
	// View 로부터 데이터를 받아서 가공하거나 처리하는 역할.
	// Model의 데이터를 수정하거나 가지고 오는 역할.
	
	//곡을 5개 저장할수 있는 ArrayList 생성
	
	ArrayList<MusicVO> musicList = new ArrayList<MusicVO>(5);

//노래를 재생 / 정지 할 수 있는 기능을 가진 객체
	//Player.jar에 있는 MP3Play
	MP3Player mp3=new MP3Player();
	int index =0;
	public Maincontroller() {
		// Controller 객채가 생성되자마자 음악을 미리 준비하도록 하기 위해서.
		// 1. MusoicVO 객체 생성.
		//2. 해당 객체를 musicList라고 하는 ArrayList에 add
		
		musicList.add(new MusicVO("꽃","지수",100,"../EX10MUSICPLALY/src/MusicList/musicList/musicList/여자아이들GIDLE  퀸카 .mp3"));
		musicList.add(new MusicVO("spicy","에스파",100,"musicList/에스파 spicy .mp3"));
		musicList.add(new MusicVO("vloet","conner",100,"musicList/conner vloet .mp3"));
		
		
	}
	
	//재생
	public void play() {
		//현재 재생중인 음악이 있는지 확인하기,
		if (mp3.isPlaying()) {
			//재생중인 음악정지
			mp3.stop();
		}
	
	//index가 가리키고 있는 위치에 음악을 재생.
		mp3.play(musicList.get(index).getMusicpath());
		
	}
	
	// 정지
	public void stop() {
		mp3.stop();

	}
	
		

	//다음곡
	public void next() {
		
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		if(index<musicList.size()-1) {
		index++;
	}else {
		index=0;
	}
		
		mp3.play(musicList.get(index).getMusicpath());
		show(); 
	}	
	// 이전곡
	public void pre() {
		//0번에서 이전곡을 재생할때는 마지막곡으로 이동하자
		if(mp3.isPlaying()) {
		
		if(index>0) {
			index--;
		}else {
		index= musicList.size()-1;
		
		}mp3.play(musicList.get(index).getMusicpath());
		show();
		
		}
		
}
		

	
	
	
	
	
	//어떤곡 재생중?
	private void show() {
		System.out.println(musicList.get(index).getTitle()+" - "
							+musicList.get(index).getSinger());
		
	}						
	
	//음악이름 찾아 재생하기
	public void search(String name) {
		for(int i=0; i<musicList.size();i++) {
			MusicVO music  = musicList.get(i);
		
		if(music.getTitle().equals(name)) {
			if(mp3.isPlaying()) {
				mp3.stop();
			}
		mp3.play(music.getMusicpath());
		index=i;
		show();
		
		}
	}
}
		
		//재생시간불러오기
		public void getPlaytime() {
	
			
			for(int i=0; i<musicList.size();i++) {
				System.out.println(musicList.get(i).getPlaytime()+" - "
						+musicList.get(i).getSinger());
			
			
		
		}
			
	}	
}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

