package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Rammstein", 1994);
        MusicBand musicBand2 = new MusicBand("Nirvana", 1987);
        MusicBand musicBand3 = new MusicBand("The Beatles", 1960);
        MusicBand musicBand4 = new MusicBand("AC/DC", 1973);
        MusicBand musicBand5 = new MusicBand("7Б", 2001);
        MusicBand musicBand6 = new MusicBand("The Script", 2001);
        MusicBand musicBand7 = new MusicBand("Stigmata", 2007);
        MusicBand musicBand8 = new MusicBand("Slot", 2002);
        MusicBand musicBand9 = new MusicBand("Iron Maiden", 1975);
        MusicBand musicBand10 = new MusicBand("Murakami", 2004);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(musicBand1);
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);
        bands.add(musicBand10);

        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                groupsAfter2000.add(band);
        }

        return groupsAfter2000;
    }
}
