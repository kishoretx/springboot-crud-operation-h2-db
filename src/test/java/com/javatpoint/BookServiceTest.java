package com.javatpoint;

import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;
import com.javatpoint.service.BooksService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

/*
* Here we are testing Service class so, we are moking Repository class.
* Here we are mocking Repository class by using annotation @Mock.
* @InjectMocks injects all the mocks into this class.
 */
@SpringBootTest
public class BookServiceTest {

    @Mock
    private BooksRepository booksRepository;

    @InjectMocks
    private BooksService booksService;

    @Test
    public void testGetBooksById() {
        Books book = new Books();
        book.setBookId(2);
        book.setBookName("To Kill a Mockingbird");
        when(booksRepository.findById(anyInt())).thenReturn(Optional.of(book));

        Books book2 = booksService.getBooksById(2);
        System.out.println(book2);
        Assertions.assertNotNull(book2.getBookName());

    }

}
