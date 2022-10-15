package com.usa.cinemaapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cinema")
@NoArgsConstructor
@Getter
@Setter
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String owner;
    private String capacity;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_category")
    @JsonIgnoreProperties("cinemas")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "cinema")
    @JsonIgnoreProperties({"cinema","client"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "cinema")
    @JsonIgnoreProperties({"cinema","client"})
    private List<Reservation> reservations;
}
