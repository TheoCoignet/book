package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BookTest {
    private static Stream<Book> bookProvider() {
        return Stream.of(
                new Book("Title 1", "Author 1", "2021-01-01"),
                new Book("Title 2", "Author 2", "2022-02-02"),
                new Book("Title 3", "Author 3", "2023-03-03")
        );
    }

    @ParameterizedTest
    @MethodSource("bookProvider")
    void getTitle(Book book) {
        assertThat(book.getTitle(), is(notNullValue()));
    }

    @ParameterizedTest
    @MethodSource("bookProvider")
    void getAuthor(Book book) {
        assertThat(book.getAuthor(), is(notNullValue()));
    }

    @ParameterizedTest
    @MethodSource("bookProvider")
    void getPublicationDate(Book book) {
        assertThat(book.getPublicationDate(), is(notNullValue()));
    }

    // Ajoutez d'autres méthodes de test si nécessaire
}

