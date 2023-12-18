package de.telran.tindersecond.service;

import de.telran.tindersecond.entity.User;

import java.util.List;

public interface UserService {

    User getNewUser();

    List<User> getByName(String name);

}
