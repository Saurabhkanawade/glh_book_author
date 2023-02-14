package com.glh.glhbookauthor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @Column(name = "book_id")
    private Long bookId;
    @Column(name = "title")
    private String title;
    @Column(name = "publication_date")
    private Date publication_date;
    @Column(name = "author")
    private String author;
}
