package lab03.hust.soict.ict.aims.media.sort;

import lab03.hust.soict.ict.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        String title1 = o1.getTitle(), title2 = o2.getTitle();
        return title1.compareTo(title2);
    }
}
