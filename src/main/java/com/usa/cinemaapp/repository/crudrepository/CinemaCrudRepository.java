package com.usa.cinemaapp.repository.crudrepository;

import com.usa.cinemaapp.model.Cinema;
import org.springframework.data.repository.CrudRepository;

public interface CinemaCrudRepository extends CrudRepository<Cinema, Integer> {
}
