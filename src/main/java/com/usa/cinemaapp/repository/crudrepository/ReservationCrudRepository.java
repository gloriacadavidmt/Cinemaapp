package com.usa.cinemaapp.repository.crudrepository;

import com.usa.cinemaapp.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
