package hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc() {
        super();
    }
    public DigitalVideoDisc(String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String category) {
        super(title, category);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public void itemDisplay() {
        System.out.println("    \nTitle: " + title + "\nCategory: " + category + "\nDirector: " + director
                            + "\nLength: " + length + "\nCost: " + cost + "\n");

    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
