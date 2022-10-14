package com.usa.cinemaapp.repository.crudrepository;

import com.usa.cinemaapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
