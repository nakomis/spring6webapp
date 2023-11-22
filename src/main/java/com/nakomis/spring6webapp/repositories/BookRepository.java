package com.nakomis.spring6webapp.repositories;

import com.nakomis.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
