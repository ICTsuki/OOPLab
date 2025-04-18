package lab03.hust.soict.ict.aims.media;

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

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public String toString() {
        StringBuilder stringBD = new StringBuilder();
        stringBD.append(this.id);
        stringBD.append(". DVD - ");
        stringBD.append(super.toString());
        stringBD.append(" - ");
        stringBD.append(this.director);
        stringBD.append(" - ");
        stringBD.append(this.length);
        stringBD.append(": ");
        stringBD.append(this.cost);
        stringBD.append("$");
        return stringBD.toString();
    }
}
