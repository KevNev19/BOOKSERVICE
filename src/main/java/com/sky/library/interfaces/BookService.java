package com.sky.library.interfaces;

import com.sky.library.exception.BookNotFoundException;
import com.sky.library.exception.BookReferenceIncorrectException;
import com.sky.library.pojo.Book;

/*
 * Copyright © 2015 Sky plc All Rights reserved.
 * Please do not make your solution publicly available in any way e.g. post in forums or commit to GitHub.
 */
public interface BookService {

    Book retrieveBook(String bookReference) throws BookNotFoundException, BookReferenceIncorrectException;

    String getBookSummary(String bookReference) throws BookNotFoundException, BookReferenceIncorrectException;
}
