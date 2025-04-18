package hust.soict.ict.aims.track;

import hust.soict.ict.aims.media.Playable;

public class Track implements Playable {
    private String title;
    private int length;

    public Track() {
        super();
    }
    public Track(String title) {
        this();
        this.title = title;
    }
    public Track(String tile, int length) {
        this(tile);
        this.length = length;
    }

    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public boolean equals(Object obj) {
        return this.length == ((Track) obj).getLength()
               && this.title.equals(((Track) obj).getTitle());
    }
}
