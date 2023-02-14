package com.glh.glhbookauthor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    private Long book_id;
    private String title;
    private String publication_date;
    private String author;

}
