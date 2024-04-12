package com.javatpoint;

import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;
import com.javatpoint.service.BooksService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.Optional;
import java.util.stream.StreamSupport;

//@DataJdbcTest
@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    private BooksRepository booksRepository;


    @Test
    public void testGetBookById() {
        Optional<Books> book = booksRepository.findById(2);
        System.out.println("Book Name: " + book.get().getBookName());
        Assertions.assertEquals("To Kill a Mockingbird", book.get().getBookName());
    }

    @Test
    public void testGetAllBook() {
        Iterable<Books> books = booksRepository.findAll();
        long count = StreamSupport.stream(books.spliterator(), false).count();

        System.out.println("Book Count: " + count);
        Assertions.assertTrue(count > 10);
    }

}
