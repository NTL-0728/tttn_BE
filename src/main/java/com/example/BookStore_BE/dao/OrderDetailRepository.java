package com.example.BookStore_BE.dao;

import com.example.BookStore_BE.entity.Order;
import com.example.BookStore_BE.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "order-detail")
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    public List<OrderDetail> findOrderDetailsByOrder(Order order);
}
