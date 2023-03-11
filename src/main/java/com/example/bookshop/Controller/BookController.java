package com.example.bookshop.Controller;

import com.example.bookshop.Model.BookModel;
import com.example.bookshop.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book/")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("createbook")
    public BookModel createBook(@RequestBody BookModel bookModel) {
        return bookService.createBook(bookModel);
    }

    @GetMapping("findbook/{id}")
    public BookModel findBook(@PathVariable String id) {
        return bookService.findBook(id);
    }

    @GetMapping("findallboks")
    public List<BookModel> findAllBooks() {
        return bookService.findAllBooks();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updatebook/{id}")
    public BookModel updateBook(@RequestBody BookModel bookModel, @PathVariable String id) {
        return bookService.updateBook(bookModel, id);
    }

    @DeleteMapping("deletebook/{id}")
    public String deleteBook(@PathVariable String id) {
        return bookService.deleteBook(id);
    }
}
