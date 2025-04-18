package hust.soict.ict.aims.media;

import hust.soict.ict.aims.media.sort.MediaComparatorByCostTitle;
import hust.soict.ict.aims.media.sort.MediaComparatorByTitleCost;

import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public static int nbMedia = 0;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();


    public Media() {
        super();
    }
    public Media(String title) {
        this();
        this.title = title;
        nbMedia++;
        this.id = nbMedia;
    }
    public Media(String title, String category) {
        this(title);
        this.category = category;
        nbMedia++;
        this.id = nbMedia;
    }
    public Media(String title, String category, float cost) {
        this(title, category);
        this.cost = cost;
        nbMedia++;
        this.id = nbMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }




    public boolean equals(Object obj) {
        return this.title.equals(((Media) obj).getTitle());
    }

    public String toString() {
        StringBuilder stringBD = new StringBuilder();
        String outputString;
        stringBD.append(this.title);
        stringBD.append(" - ");
        stringBD.append(this.category);
        outputString = stringBD.toString();
        return outputString;
    }
}
