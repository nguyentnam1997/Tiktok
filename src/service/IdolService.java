package service;

import entities.Follower;
import entities.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService {
    public Idol inputIdol(Scanner scanner, ArrayList<Follower> followers, FollowerService followerService) {
        System.out.println("Mời nhập thông tin IDOL:");
        System.out.println("Tên idol:");
        String idolName = scanner.nextLine();
        System.out.println("Email idol:");
        String idolEmail = scanner.nextLine();
        System.out.println("Group mà idol đang tham gia:");
        String group = scanner.nextLine();
        System.out.println("Mời nhập số người theo dõi idol:");
        int countFollower = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countFollower; i++) {
            System.out.println("======= Người thứ " + (i + 1) + " =======");
            followers.add(followerService.inputFollower(scanner, countFollower));
        }
        return new Idol(idolName, idolEmail, followers, group);
    }
}
