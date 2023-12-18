package de.telran.tindersecond.repository;

import de.telran.tindersecond.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getUsersByNameStartingWithIgnoreCase(String name); //Method-naming
    //Select * from user where name like 'то, что вы вставите + %'

    @Query("SELECT new User(u.id, u.name, u.rating, u.description) from User u " +
            " where u.name like :name%") //JPQL
    List<User> findAutocomplete3(@Param(value = "name") String name);

    @Query(nativeQuery = true, value = "SELECT * FROM account WHERE name LIKE :name% ") //SQL
    List<User> findAutocomplete2(@Param(value = "name") String name);

}
