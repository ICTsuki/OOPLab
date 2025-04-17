package hust.soict.ict.aims.media;

import hust.soict.ict.aims.track.Track;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc{
    private String artist;
    private List<Track> tracks;

    public CompactDisc() {
        super();
        tracks = new ArrayList<>();
    }
    public CompactDisc(String title, String category, float cost, String director, String artist) {
        super(title, category, cost, director);
        this.artist = artist;
        tracks = new ArrayList<>();
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

    public int getLength() {
        int sum = 0;
        for(Track track : tracks) {
            sum += track.getLength();
        }
        return sum;
    }
}
