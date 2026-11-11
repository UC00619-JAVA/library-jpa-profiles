package com.example.libraryjpa.transfer;

import com.example.libraryjpa.model.Book;

public record BookResponse(Long id, String title, String author,
                           int publishedYear, boolean available) {

    public static BookResponse from(Book book) {
        return new BookResponse(book.getId(), book.getTitle(), book.getAuthor(),
                book.getPublishedYear(), book.isAvailable());
    }
}
