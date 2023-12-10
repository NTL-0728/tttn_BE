package com.example.BookStore_BE.dao;

import com.example.BookStore_BE.entity.OrderDetail;
import com.example.BookStore_BE.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "reviews")
public interface ReviewRepository extends JpaRepository<Review, Long> {
    public Review findReviewByOrderDetail(OrderDetail orderDetail);
}
