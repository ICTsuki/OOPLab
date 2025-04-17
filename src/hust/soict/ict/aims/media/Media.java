package hust.soict.ict.aims.media;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public static int nbMedia;


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
}
