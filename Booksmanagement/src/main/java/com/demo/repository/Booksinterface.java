package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Booksmodel;



@Repository
public interface Booksinterface  extends JpaRepository<Booksmodel,Integer>

{

}
