package de.telran.tindersecond.service.impl;

import de.telran.tindersecond.entity.User;
import de.telran.tindersecond.repository.PhotoRepository;
import de.telran.tindersecond.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TopRatingUserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PhotoRepository photoRepository;

    @InjectMocks
    private TopRatingUserService topRatingUserService;


    @Test
    public void test() {
        //задание начальных значений - нет этого пункта
        List<User> users = new ArrayList<>();
        User first = new User(1L, "Петр", 100, "Просто Петр", null);
        User second = new User(2L, "Иван", 200, "Просто Иван", null);
        users.add(first);
        users.add(second);

        when(userRepository.findAll()).thenReturn(users);

        //запустить сам метод
        User user = topRatingUserService.getNewUser();

        //проверка результата
        assertEquals(second, user);
        verify(userRepository, times(1)).findAll();
    }

    @Test
    public void getByName_nameDaniil_success() {
        List<User> users = new ArrayList<>();
        User first = new User(1L, "Даниил Ткаченко", 100, "Просто ДТ", null);
        User second = new User(2L, "Даниил Петров", 200, "Просто ДП", null);
        users.add(first);
        users.add(second);

        //задание начальных значений - нет этого пункта
        when(userRepository.findAutocomplete2(eq("Даниил"))).thenReturn(users);
        when(userRepository.findAutocomplete2(eq("Петр"))).thenReturn(new ArrayList<>());

        //запустить сам метод
        List<User> usersList = topRatingUserService.getByName("Даниил11111111111");


        //проверка результата
        assertEquals(2, usersList.size());
    }



}