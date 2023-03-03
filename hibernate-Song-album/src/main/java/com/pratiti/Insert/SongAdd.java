package com.pratiti.Insert;

import java.util.Scanner;

import com.pratiti.dao.AlbumSongDao;
import com.pratiti.entity.Album;
import com.pratiti.entity.Song;

public class SongAdd {

	@SuppressWarnings("resource")
	public SongAdd() {
		
		Scanner sc = new Scanner(System.in);
		AlbumSongDao dao = new AlbumSongDao();
		
		

		
		Song song = new Song();
		
		System.out.println("Enter Song Name : ");
		String sng = sc.next();	
		song.setTitle(sng);
		
		System.out.println("Enter Artist Name : ");
		String art = sc.next();	
		song.setArtist(art);
		
		System.out.println("Enter Album Id where you want to add this song");
		int id = sc.nextInt();
		Album album = (Album) dao.fetchById(Album.class, id);
		song.setAlbum(album);
		
//		SongList sl = new SongList();
		
		dao.save(song);

	}

}
