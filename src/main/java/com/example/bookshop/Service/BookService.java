package com.example.bookshop.Service;

import com.example.bookshop.Model.BookModel;
import com.example.bookshop.Model.CustomerModel;
import com.example.bookshop.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookModel createBook(BookModel bookModel) {
        return bookRepository.save(bookModel);
    }

    public BookModel findBook(String id) {
        return bookRepository.findById(id).get();
    }

    public List<BookModel> findAllBooks() {
        return bookRepository.findAll();
    }

    public BookModel updateBook(BookModel bookModel, String id) {
        return bookRepository.save(bookModel);
    }

    public String deleteBook(String id) {
        bookRepository.deleteById(id);
        return "book id " + id + " has been deleted!";
    }

}
