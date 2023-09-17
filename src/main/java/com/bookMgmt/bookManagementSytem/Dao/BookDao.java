package com.bookMgmt.bookManagementSytem.Dao;

import com.bookMgmt.bookManagementSytem.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}
