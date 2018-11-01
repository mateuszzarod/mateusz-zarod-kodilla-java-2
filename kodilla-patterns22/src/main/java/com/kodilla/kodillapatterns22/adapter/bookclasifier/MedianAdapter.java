package com.kodilla.kodillapatterns22.adapter.bookclasifier;

import com.kodilla.kodillapatterns22.adapter.bookclasifier.librarya.BookA;
import com.kodilla.kodillapatterns22.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns22.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.kodillapatterns22.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature,BookB> bookBMap = new HashMap<>();
        for (BookA bookA: bookSet){
            BookSignature signature = new BookSignature(bookA.getSignature());
            BookB bookB = new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            bookBMap.put(signature, bookB);
        }
        return medianPublicationYear(bookBMap);
    }
}
