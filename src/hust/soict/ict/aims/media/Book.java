package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<>();

    public Book() {
        super();
    }

    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public void addAuthor(String authorName) {
        if(!authors.contains(authorName)) {
            authors.add(authorName);
        }
        else {
            System.out.println("Author " + authorName + " already added!");
        }
    }
    public void removeAuthors(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
        }
        else {
            System.out.println("Author deleted or not exist!!");
        }
    }

    public String toString() {
        StringBuilder stringBD = new StringBuilder();
        stringBD.append(this.id);
        stringBD.append(". BOOK - ");
        stringBD.append(super.toString());
        for(String author : authors) {
            stringBD.append(" - ");
            stringBD.append(author);
        }
        stringBD.append(": ");
        stringBD.append(this.cost);
        stringBD.append("$");
        return stringBD.toString();
    }
}
