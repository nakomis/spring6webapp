package com.nakomis.spring6webapp.services;

import com.nakomis.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
