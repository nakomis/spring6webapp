package com.nakomis.spring6webapp.services;

import com.nakomis.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
