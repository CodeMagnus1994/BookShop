package com.example.bookshop.Repository;

import com.example.bookshop.Model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookModel, String> {

   // List<BookModel> wishlistOfBooks(String id);

}
