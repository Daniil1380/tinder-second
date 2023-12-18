package de.telran.tindersecond.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POJO - plain old java object - старый добрый джава объект
@Entity //сущность jpa
@Table(name = "account") //какая таблица
@Data //getter + setter + required args + to string + equals
@AllArgsConstructor //конструктор со всеми полями
@NoArgsConstructor
public class User {

    @Id //поле уникальности + pk
    @Column(name = "id") //именование столбца в бд
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "rating")
    private int rating;

    @Column(name = "description")
    private String description;

}
