package mvc.controller;

import java.util.ArrayList;

import mvc.model.vo.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	public ArrayList<Music> selectList() {
		return list; 
	}
	
	public ArrayList<Music> searchMusic(int search, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList();
		
		
	}
	
	
	
	
	
}
