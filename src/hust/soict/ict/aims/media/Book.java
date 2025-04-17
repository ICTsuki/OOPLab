package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors;

    public Book() {
        super();
        authors = new ArrayList<>();
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
}
