package hust.soict.ict.aims.media;

import hust.soict.ict.aims.track.Track;

import java.util.ArrayList;
import java.util.List;


public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc() {
        super();
    }
    public CompactDisc(String title) {
        super(title);
    }
    public CompactDisc(String title, String category) {
        super(title, category);
    }
    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public CompactDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }
    public CompactDisc(String title, String category, float cost, String director, String artist) {
        super(title, category, cost, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if(!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("xTrack included");
        }
        else {
            System.out.println("Failed!\nTrack already included.");
        }
    }

    public void removeTrack(Track track) {
        if(tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed");
        }
        else {
            System.out.println("Failed!\nTrack has been removed before or does not exist");
        }
    }

    @Override
    public int getLength() {
        int sum = 0;
        for(Track track : tracks) {
            sum += track.getLength();
        }
        return sum;
    }

    public void play() {
        for(Track track : tracks) {
            track.play();
        }
    }
}
