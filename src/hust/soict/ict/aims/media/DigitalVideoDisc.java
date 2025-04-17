package hust.soict.ict.aims.media;

import hust.soict.ict.aims.track.Track;

import java.util.ArrayList;
import java.util.List;

public class DigitalVideoDisc extends Disc{
    private List<Track> trackList;

    public DigitalVideoDisc() {
        super();
        trackList = new ArrayList<>();
    }
    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
        trackList = new ArrayList<>();
    }


    public void itemDisplay() {
        System.out.println("    \nTitle: " + title + "\nCategory: " + category + "\nDirector: " + director
                            + "\nLength: " + length + "\nCost: " + cost + "\n");

    }

    private int totalLength() {
        int result = 0;
        for(Track tr : trackList) {
            result += tr.getLength();
        }
        return result;
    }
}
