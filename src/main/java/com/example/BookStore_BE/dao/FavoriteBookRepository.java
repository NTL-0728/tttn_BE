package com.example.BookStore_BE.dao;

import com.example.BookStore_BE.entity.Book;
import com.example.BookStore_BE.entity.FavoriteBook;
import com.example.BookStore_BE.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "favorite-books")
public interface FavoriteBookRepository extends JpaRepository<FavoriteBook, Integer> {
    public FavoriteBook findFavoriteBookByBookAndUser(Book book, User user);
    public List<FavoriteBook> findFavoriteBooksByUser(User user);
}
