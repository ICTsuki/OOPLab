package hust.soict.ict.aims.track;

public class Track {
    private String title;
    private int length;

    public Track() {
        super();
    }
    public Track(String tile, int length) {
        this();
        this.title = tile;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
}
