/**
 * Represents a book
 */


package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    public static final int ISBN_=0;
    public static final int TITLE_=0;
    public static final int SUBJECT_=0;
    public static final int PAGE_COUNT_=0;
    public static final int AUTHOR_=0;
    public static final int DUE_DATE_=0;

    private String isbn;
    private String title;
    private String subject;
    private int pageCount;
    private String author;
    private LocalDate dueDate;

    public Book(String author, int pageCount, String subject, String title, String isbn) {
        this.author = author;
        this.pageCount = pageCount;
        this.subject = subject;
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount && Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(subject, book.subject) && Objects.equals(author, book.author);
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, subject, pageCount, author);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return (title + " By " + author + " ISBN: " + isbn);
    }
}
