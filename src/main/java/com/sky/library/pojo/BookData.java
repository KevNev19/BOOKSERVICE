/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sky.library.pojo;

import com.sky.library.pojo.Book;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author addis
 */
public class BookData {

    private static final String BOOK_REFERENCE_PREFIX = "BOOK-";

    private static final String THE_GRUFFALO_REFERENCE = BOOK_REFERENCE_PREFIX + "GRUFF472";
    private static final String WINNIE_THE_POOH_REFERENCE = BOOK_REFERENCE_PREFIX + "POOH222";
    private static final String THE_WIND_IN_THE_WILLOWS_REFERENCE = BOOK_REFERENCE_PREFIX + "WILL987";

    public static final String BOOK_REFERENCE_MUST_BEGIN_WITH_BOOK = "book reference must begin with BOOK-";

    public static final Map<String, Book> books;

    static {
        books = new HashMap<String, Book>();
        books.put(THE_GRUFFALO_REFERENCE, new Book(THE_GRUFFALO_REFERENCE, "The Gruffalo", "A mouse taking a walk in the woods"));
        books.put(WINNIE_THE_POOH_REFERENCE, new Book(WINNIE_THE_POOH_REFERENCE, "Winnie The Pooh", "In this first volume we meet all the friends from the Hundred Acre Wood."));
        books.put(THE_WIND_IN_THE_WILLOWS_REFERENCE, new Book(THE_WIND_IN_THE_WILLOWS_REFERENCE, "The Wind In The Willows", "With the arrival of spring and fine weather outside, "
                + "the good-natured Mole loses patience with spring cleaning. He flees his underground home, emerging to take in the air and ends up at the river, which he has "
                + "never seen before. Here he meets Rat (a water vole), who at this time of year spends all his days in, on and close by the river. Rat takes Mole for a ride "
                + "in his rowing boat. They get along well and spend many more days boating, with Rat teaching Mole the ways of the river."));
    }

}
