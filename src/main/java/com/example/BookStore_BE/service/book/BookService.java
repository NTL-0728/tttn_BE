package com.example.BookStore_BE.service.book;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.ResponseEntity;

public interface BookService {
    public ResponseEntity<?> save(JsonNode bookJson);
    public ResponseEntity<?> update(JsonNode bookJson);
}
