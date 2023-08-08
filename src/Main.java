import entities.Follower;
import entities.Idol;
import entities.Song;
import entities.Tiktok;
import service.FollowerService;
import service.IdolService;
import service.SongService;
import service.TiktokService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Follower> followers = new ArrayList<>();
        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<Idol> idols = new ArrayList<>();
        FollowerService followerService = new FollowerService();
        IdolService idolService = new IdolService();
        SongService songService = new SongService();
        TiktokService tiktokService = new TiktokService();
        Tiktok tiktok = tiktokService.inputTiktok(scanner, followers, idols, songs, songService, idolService, followerService);
        System.out.println(tiktok);

    }
}