package hust.soict.ict.aims.media;

public class Disc extends Media{
    protected String artist;
    protected int length;
    protected String director;

    public Disc() {
        super();
    }
    public Disc(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }

    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }

}
