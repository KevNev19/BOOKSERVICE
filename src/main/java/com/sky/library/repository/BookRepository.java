package com.sky.library.repository;

import com.sky.library.obj.Book;

/*
 * Copyright © 2015 Sky plc All Rights reserved.
 * Please do not make your solution publicly available in any way e.g. post in forums or commit to GitHub.
 */

public interface BookRepository {
    Book retrieveBook(String reference);
}
