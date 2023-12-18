package de.telran.tindersecond.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "photo")
public class Photo {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
