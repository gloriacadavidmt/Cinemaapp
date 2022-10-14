package com.usa.cinemaapp.service;

import com.usa.cinemaapp.model.Cinema;
import com.usa.cinemaapp.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public List<Cinema> getAll(){
        return cinemaRepository.getAll();
    }

    public Optional<Cinema> getById(Integer id){
        return cinemaRepository.getById(id);
    }

    public Cinema save(Cinema cinema) {
        if (cinema.getId() == null) {
            return cinemaRepository.save(cinema);
        } else {
            Optional<Cinema> optional = cinemaRepository.getById(cinema.getId());

            if (optional.isEmpty()) {
                return cinemaRepository.save(cinema);
            } else {
                return cinema;
            }
        }
    }
        public Cinema update(Cinema cinema){
            if(cinema.getId()!=null){
                Optional<Cinema> optional=cinemaRepository.getById(cinema.getId());
                if(!optional.isEmpty()){
                    if(cinema.getOwner()!=null){
                        optional.get().setOwner(cinema.getOwner());
                    }
                    if (cinema.getCapacity()!=null){
                        optional.get().setCapacity(cinema.getCapacity());
                    }
                    if (cinema.getName()!=null){
                        optional.get().setName(cinema.getName());
                    }
                    if (cinema.getDescription()!=null){
                        optional.get().setDescription(cinema.getDescription());
                    }
                    if (cinema.getCategory()!=null){
                        optional.get().setCategory(cinema.getCategory());
                    }
                    cinemaRepository.save(optional.get());
                    return optional.get();
                }else {
                    return cinema;
                            }
                }else {
                return cinema;
            }
    }
    public boolean delete(Integer id){
        Boolean aBoolean=getById(id).map(cinema -> {
            cinemaRepository.delete(cinema);
            return true;
        }).orElse(false);
        return aBoolean;
    }

}
