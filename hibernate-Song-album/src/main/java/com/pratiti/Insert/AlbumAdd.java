package com.pratiti.Insert;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pratiti.dao.AlbumSongDao;
import com.pratiti.entity.Album;
import com.pratiti.entity.Song;

public class AlbumAdd {

	@SuppressWarnings({ "resource", "unused" })
	public void AlbumAdding() {

		AlbumSongDao dao = new AlbumSongDao();
		Scanner sc = new Scanner(System.in);
		SongList sn = new SongList();

		Album alb = new Album();

		System.out.println("Enter ALbum Name : ");
		String Albname = sc.next();
		alb.setName(Albname);

		System.out.println("Enter Release Date of album : ");
		String releaes = sc.next();
		LocalDate releaseDate = LocalDate.parse(releaes);
		alb.setReleaseDate(releaseDate);

		dao.save(alb);
	}
	
	
	// Song and album addition
	public void songAlbumAdding() {
		AlbumSongDao dao = new AlbumSongDao();

		Album m=new Album();
		m.setName("Dhadkan");
		m.setReleaseDate(LocalDate.of(2001, 2, 3));
		
		Song s1=new Song();
		s1.setTitle("Dulhe ka sehra");
		s1.setArtist("Fateh Ali khan");
		s1.setAlbum(m);
		
		Song s2=new Song();
		s2.setTitle("tum dil ki dhadkan mein");
		s2.setArtist("Kumar sanu");
		s2.setAlbum(m);
		
		List<Song> list=new ArrayList<Song>();
		list.add(s1);
		list.add(s2);
		m.setSongs(list);
		
		dao.save(m);//ensure cascade has been set up in the Movie class
		
	}

}
