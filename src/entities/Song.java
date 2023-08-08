package entities;

public class Song {
    public static int autoId = 0;
    private int id;
    private String name;
    private String singer;

    public Song(String name, String singer) {
        this.id = ++autoId;
        this.name = name;
        this.singer = singer;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Bài hát thứ " + id +
                ": tên = " + name +
                ", ca sĩ = " + singer;
    }
}
