package com.usa.cinemaapp.controller;

import com.usa.cinemaapp.model.Cinema;
import com.usa.cinemaapp.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Cinema")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/all")
    public List<Cinema> getAll(){
        return cinemaService.getAll();
    }
    @GetMapping("/idCinema")
    public Optional<Cinema> getById(@PathVariable("idCinema") Integer id){
        return cinemaService.getById(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cinema save(@RequestBody Cinema cinema){
        return cinemaService.save(cinema);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cinema update(@RequestBody Cinema cinema){
        return cinemaService.update(cinema);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id){
        return cinemaService.delete(id);
    }
}
