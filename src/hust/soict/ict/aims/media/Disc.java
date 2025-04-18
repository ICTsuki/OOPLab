package hust.soict.ict.aims.media;

public class Disc extends Media {
    protected int length;
    protected String director;

    public Disc() {
        super();
    }
    public Disc(String title) {
        super(title);
    }
    public Disc(String title, String category) {
        super(title, category);
    }
    public Disc(String title, String category, float cost) {
        super(title, category, cost);
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

    public String toString() {
        return super.toString();
    }

}
