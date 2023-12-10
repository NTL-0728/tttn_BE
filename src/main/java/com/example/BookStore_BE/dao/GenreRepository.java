package com.example.BookStore_BE.dao;

import com.example.BookStore_BE.entity.Genre;
import com.example.BookStore_BE.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "genre")
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
