package com.daniela.collections;

import java.util.*;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        //we must define the criteria to establish when one book is less than other book
        if(o1.getPublishingYear() < o2.getPublishingYear()) {
            return -1;
        } else if(o1.getPublishingYear() > o2.getPublishingYear()) {
            return 1;
        } else {
            return 0;
        }
    }
}
