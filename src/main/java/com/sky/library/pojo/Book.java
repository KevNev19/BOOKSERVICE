package com.sky.library.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * Copyright © 2015 Sky plc All Rights reserved.
 * Please do not make your solution publicly available in any way e.g. post in forums or commit to GitHub.
 */
@Data
@AllArgsConstructor
public class Book {
    private String reference;
    private String title;
    private String review;
}
