package hust.soict.ict.aims.disc;

import hust.soict.ict.aims.disc.track.Track;

import java.util.ArrayList;
import java.util.List;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private  String title;
    private String category;
    private String director;
    private String artist;
    private List<Track> trackList = new ArrayList<>();
    private  int length;
    private float cost;

    public DigitalVideoDisc() {
        super();
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title) {
        this();
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category) {
        this(title);
        this.category = category;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director) {
        this(title, category);
        this.director = director;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director, int length) {
        this(title, category, director);
        this.length = length;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, length);
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost){
        this(title, category);
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }


    public String getDirector() {
        return director;
    }
    public String getCategory() {
        return category;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getId() {
        return this.id;
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
