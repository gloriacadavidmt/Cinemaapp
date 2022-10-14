package com.usa.cinemaapp.repository.crudrepository;

import com.usa.cinemaapp.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
