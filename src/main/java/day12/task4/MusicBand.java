package day12.task4;

import java.util.List;

/**
 * Created by Vadim Khublarian on 12/13/20.
 */
public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (String member : musicBand1.getMembers()) {
            musicBand2.getMembers().add(member);
        }
        musicBand1.getMembers().clear();
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
