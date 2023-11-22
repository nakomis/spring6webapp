package services;

import com.nakomis.spring6webapp.domain.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Iterable<Book> findAll();

}
