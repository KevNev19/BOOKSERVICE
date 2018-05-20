package com.sky.library;

import com.sky.library.exception.BookNotFoundException;
import com.sky.library.exception.BookReferenceIncorrectException;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author addis
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class BookServiceTest {
    
     private BookRepositoryStub bookRepo = new BookRepositoryStub();
     
    @Test
    public void should_retrieve_book_summary_success() throws BookNotFoundException, BookReferenceIncorrectException {
        String bookref = "BOOK-GRUFF472";
        String summary = bookRepo.getBookSummary(bookref);
        assertNotNull(summary);
        assertEquals("A mouse taking a walk in the woods", summary);
    }
    
    @Test
    public void should_retrieve_book_summary_concat_success() throws BookNotFoundException, BookReferenceIncorrectException {
        String bookref = "BOOK-WILL987";
        String summary = bookRepo.getBookSummary(bookref);
        assertNotNull(summary);
        assertThat(summary, containsString("..."));
        assertThat(summary.split(" ").length, not(10));
    }

    @Test(expected = BookNotFoundException.class)
    public void should_not_retrieve_book_summary_not_found() throws BookNotFoundException, BookReferenceIncorrectException {
        String bookref = "BOOK-999";
        String book = bookRepo.getBookSummary(bookref);
    }

    @Test(expected = BookReferenceIncorrectException.class)
    public void should_not_retrieve_book_summary_wrong_ref() throws BookNotFoundException, BookReferenceIncorrectException {
        String bookref = "INVALID-TEXT";
        String book = bookRepo.getBookSummary(bookref);
    }
}
