package entities;

import java.util.ArrayList;

public class Idol {
    public static int autoId = 0;
    private int id;
    private String name;
    private String email;
    private ArrayList<Follower> followers;
    private String group;

    public Idol(String name, String email, ArrayList<Follower> followers, String group) {
        this.id = ++autoId;
        this.name = name;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol thứ " + id +
                ": tên = " + name +
                ", email = " + email +
                ", danh sách follower: " + followers +
                ", group = " + group;
    }
}
