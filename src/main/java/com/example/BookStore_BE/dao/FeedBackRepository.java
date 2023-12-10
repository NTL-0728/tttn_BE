package com.example.BookStore_BE.dao;

import com.example.BookStore_BE.entity.Feedbacks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "feedbacks")
public interface FeedBackRepository extends JpaRepository<Feedbacks, Integer> {

}
