package de.telran.tindersecond.repository;

import de.telran.tindersecond.entity.SecurityAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityAccountRepository extends CrudRepository<SecurityAccount, Integer> {

    SecurityAccount findByLogin(String login);
}
