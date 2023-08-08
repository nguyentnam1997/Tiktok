package service;

import entities.Follower;
import entities.Idol;
import entities.Song;
import entities.Tiktok;

import java.util.ArrayList;
import java.util.Scanner;

public class TiktokService {
    public Tiktok inputTiktok(Scanner scanner, ArrayList<Follower> followers, ArrayList<Idol> idols, ArrayList<Song> songs, SongService songService, IdolService idolService, FollowerService followerService) {
        do {
            System.out.println("Mời nhập số bài hát Tiktok:");
            int countSong = Integer.parseInt(scanner.nextLine());
            if (countSong < 0) {
                System.out.println("Song không được phép âm, mời nhập lại!");
                continue;
            }
            for (int i = 0; i < countSong; i++) {
                System.out.println("======= Bài hát thứ " + (i + 1) + " =======");
                songs.add(songService.inputSong(scanner));
            }
            System.out.println("Mời nhập số idol:");
            int countIdol = Integer.parseInt(scanner.nextLine());
            do {
                if (countIdol < 0) {
                    System.out.println("Idol không được phép âm, mời nhập lại!");
                    continue;
                }
                for (int i = 0; i < countIdol; i++) {
                    System.out.println("======= Idol thứ " + (i + 1) + " =======");
                    idols.add(idolService.inputIdol(scanner, followers, followerService));
                }
                return new Tiktok(idols, songs);
            }
            while (true);
        }
        while (true);
    }
}
