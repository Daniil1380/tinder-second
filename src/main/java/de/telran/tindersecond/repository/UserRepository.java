package de.telran.tindersecond.repository;

import de.telran.tindersecond.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getUsersByNameStartingWith(String name);
    //Select * from user where name like 'то, что вы вставите + %'

}
