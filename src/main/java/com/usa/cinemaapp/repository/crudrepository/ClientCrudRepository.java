package com.usa.cinemaapp.repository.crudrepository;

import com.usa.cinemaapp.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}
