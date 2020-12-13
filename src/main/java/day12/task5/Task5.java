package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> rammsteinMembers = new ArrayList<>();
        rammsteinMembers.add(new MusicArtist("Till Lindemann", 57));
        rammsteinMembers.add(new MusicArtist("Richard Kruspe", 53));
        rammsteinMembers.add(new MusicArtist("Paul Landers", 55));
        rammsteinMembers.add(new MusicArtist("Oliver Riedel", 49));
        rammsteinMembers.add(new MusicArtist("Christoph Schneider", 54));
        rammsteinMembers.add(new MusicArtist("Christian Lorenz", 54));

        List<MusicArtist> oomphMembers = new ArrayList<>();
        oomphMembers.add(new MusicArtist("Dero Goi", 50));
        oomphMembers.add(new MusicArtist("Crap", 50));
        oomphMembers.add(new MusicArtist("Flux", 53));

        MusicBand rammstein = new MusicBand("Rammstein", 1994, rammsteinMembers);
        MusicBand oomph = new MusicBand("Oomph!", 1989, oomphMembers);

        rammstein.printMembers();
        oomph.printMembers();

        MusicBand.transferMembers(oomph, rammstein);
        oomph.printMembers();
        rammstein.printMembers();
    }
}
