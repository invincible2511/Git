package com.pratiti.Insert;

import java.util.ArrayList;
import java.util.List;

import com.pratiti.entity.Song;

public class SongList {

	public  List<Song> Songlst(Song song) {
		
		List<Song>sng = new ArrayList<Song>();
		sng.add(song);
		return sng;
	}
	
}
