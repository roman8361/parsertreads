package ru.kravchenko.sb.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kravchenko.sb.entity.User;

/**
 * @author Roman Kravchenko
 */

@Repository
public interface IUserRepository extends JpaRepository<User, String> {

}
