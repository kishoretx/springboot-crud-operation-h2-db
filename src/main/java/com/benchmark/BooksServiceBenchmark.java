package com.benchmark;

import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;
import com.javatpoint.service.BooksService;
import org.openjdk.jmh.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(1)
public class BooksServiceBenchmark {

    @Autowired
    private BooksRepository booksRepository;
    @Autowired
    private BooksService booksService;

    @Setup
    public void setup() {

        booksService = new BooksService(booksRepository);
        // Populate the mock repository with sample data if needed
    }


    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }


    @Benchmark
    public List<Books> getAllBooksBenchmark() {
        return booksService.getAllBooks();
    }

    @Benchmark
    public Books getBooksByIdBenchmark() {
        int id = 1; // Replace with an existing book ID
        return booksService.getBooksById(id);
    }

    // Add benchmark methods for other operations (save, delete, update) as needed

}
