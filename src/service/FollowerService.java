package service;

import entities.Follower;

import java.util.ArrayList;
import java.util.Scanner;

public class FollowerService {
    public Follower inputFollower(Scanner scanner, int countFollower) {
            System.out.println("Tên:");
            String followerName = scanner.nextLine();
            System.out.println("Email:");
            String followerEmail = scanner.nextLine();
            System.out.println("Số lượt like:");
            int numberOfLike = Integer.parseInt(scanner.nextLine());

        return new Follower(followerName, followerEmail, numberOfLike);
    }
}
