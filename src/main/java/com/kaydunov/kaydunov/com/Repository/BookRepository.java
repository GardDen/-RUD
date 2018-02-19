package com.kaydunov.kaydunov.com.Repository;

import com.kaydunov.kaydunov.com.Entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{
}
