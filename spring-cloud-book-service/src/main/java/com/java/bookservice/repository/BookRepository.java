package com.java.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.bookservice.bean.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
