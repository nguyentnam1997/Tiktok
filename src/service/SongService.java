package service;

import entities.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class SongService {
    public Song inputSong(Scanner scanner) {
            System.out.println("Tên bài hát:");
            String songName = scanner.nextLine();
            System.out.println("Ca sĩ hát bài hát này:");
            String singer = scanner.nextLine();
            return new Song(songName, singer);
    }
}
