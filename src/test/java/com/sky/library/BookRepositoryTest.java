/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sky.library;

import com.sky.library.exception.BookNotFoundException;
import com.sky.library.exception.BookReferenceIncorrectException;
import com.sky.library.pojo.Book;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author addis
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class BookRepositoryTest {

    private BookRepositoryStub bookRepo = new BookRepositoryStub();

    @Test
    public void should_retrieve_book_success() throws BookNotFoundException, BookReferenceIncorrectException {
        String bookref = "BOOK-GRUFF472";
        Book book = bookRepo.retrieveBook(bookref);
        assertNotNull(book);
        assertEquals(bookref, book.getReference());
    }

    @Test(expected = BookNotFoundException.class)
    public void should_not_retrieve_book_not_found() throws BookNotFoundException, BookReferenceIncorrectException {
        String bookref = "BOOK-999";
        Book book = bookRepo.retrieveBook(bookref);
    }

    @Test(expected = BookReferenceIncorrectException.class)
    public void should_not_retrieve_book_wrong_ref() throws BookNotFoundException, BookReferenceIncorrectException {
        String bookref = "INVALID-TEXT";
        Book book = bookRepo.retrieveBook(bookref);
    }

}
