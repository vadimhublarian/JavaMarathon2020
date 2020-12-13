package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> rammsteinMembers = new ArrayList<>();
        rammsteinMembers.add("Till Lindemann");
        rammsteinMembers.add("Richard Kruspe");
        rammsteinMembers.add("Paul Landers");
        rammsteinMembers.add("Oliver Riedel");
        rammsteinMembers.add("Christoph Schneider");
        rammsteinMembers.add("Christian Lorenz");

        List<String> oomphMembers = new ArrayList<>();
        oomphMembers.add("Dero Goi");
        oomphMembers.add("Crap");
        oomphMembers.add("Flux");

        MusicBand rammstein = new MusicBand("Rammstein", 1994, rammsteinMembers);
        MusicBand oomph = new MusicBand("Oomph!", 1989, oomphMembers);

        rammstein.printMembers();
        oomph.printMembers();

        MusicBand.transferMembers(oomph, rammstein);
        oomph.printMembers();
        rammstein.printMembers();
    }
}
