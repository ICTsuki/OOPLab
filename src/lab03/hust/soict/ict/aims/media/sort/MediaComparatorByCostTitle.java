package lab03.hust.soict.ict.aims.media.sort;

import lab03.hust.soict.ict.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        float cost1 = o1.getCost(), cost2 = o2.getCost();
        return Float.compare(cost1, cost2);
    }

}
