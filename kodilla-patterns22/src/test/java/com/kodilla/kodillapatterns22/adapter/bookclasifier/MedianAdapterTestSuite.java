package com.kodilla.kodillapatterns22.adapter.bookclasifier;

import com.kodilla.kodillapatterns22.adapter.bookclasifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void medianAdapterTest() {
        BookA book1 = new BookA("Tomnasz M", "XXX", "123432", 2013);
        BookA book2 = new BookA("Tomnasz M", "XXX", "123432", 2013);
        BookA book3 = new BookA("Tomnasz M", "XXX", "123432", 2014);
        BookA book4 = new BookA("Tomnasz M", "XXX", "123432", 2015);
        BookA book5 = new BookA("Tomnasz M", "XXX", "123432", 2017);
        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(book1);
        bookASet.add(book2);
        bookASet.add(book3);
        bookASet.add(book4);
        bookASet.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(bookASet);
        assertEquals(2014, result);
    }
}