package com.kodilla.kodillapatterns22.adapter.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<BookA> bookSet);
}
