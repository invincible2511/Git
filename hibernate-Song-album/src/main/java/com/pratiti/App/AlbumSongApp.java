package com.pratiti.App;

import java.util.Scanner;

import com.pratiti.Insert.AlbumAdd;
import com.pratiti.Insert.SongAdd;
import com.pratiti.dao.AlbumSongDao;

public class AlbumSongApp {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		AlbumSongDao dao = new AlbumSongDao();
		Scanner sc = new Scanner(System.in);

		
		
		// Adding A Song 
		System.out.println("Do you want to add any song in album : (y=1/n) ");
		int con = sc.nextInt();
		if (con == 1) {

			SongAdd s = new SongAdd();
		}
			
		
		System.out.println("Do you want to add  album : (y=1/n) ");
		int con1 = sc.nextInt();
		if (con1 == 1) {

			AlbumAdd a = new AlbumAdd();
			a.AlbumAdding();
		}
		
		
		System.out.println("Do you want to add song and album both at same time(default) : (y=1/n) ");
		int con2 = sc.nextInt();
		if (con2 == 1) {

			AlbumAdd a = new AlbumAdd();
			a.songAlbumAdding();
		}
		

	}

}
