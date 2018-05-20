package com.sky.library;

/*
 * Copyright © 2015 Sky plc All Rights reserved.
 * Please do not make your solution publicly available in any way e.g. post in forums or commit to GitHub.
 */
import com.sky.library.exception.BookNotFoundException;
import com.sky.library.exception.BookReferenceIncorrectException;
import com.sky.library.interfaces.BookService;
import com.sky.library.pojo.Book;
import com.sky.library.pojo.BookData;

public class BookRepositoryStub extends BookData implements BookService {

    @Override
    public Book retrieveBook(String reference) throws BookNotFoundException, BookReferenceIncorrectException {
        if (!reference.startsWith("BOOK-")) {
            throw new BookReferenceIncorrectException(BOOK_REFERENCE_MUST_BEGIN_WITH_BOOK);
        }
        Book book = books.get(reference);
        if (null == book) {
            throw new BookNotFoundException("reference " + reference + "  not found.");
        }
        return book;
    }

    @Override
    public String getBookSummary(String bookReference) throws BookNotFoundException, BookReferenceIncorrectException {
        Book book = retrieveBook(bookReference);

        if (book.getReview().split(" ").length > 9) {
            concatSummary(book);
        }

        return book.getReview();
    }

    private void concatSummary(Book book) {
        String[] split = book.getReview().split(" ");
        split[8] = "...";
        String summary = "";
        for (int i = 0; i < 9; i++) {
            summary += split[i] + " ";
        }
        
        book.setReview(summary.trim());
    }
}
