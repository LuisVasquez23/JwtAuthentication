package org.example.jwtlogin.Application.Repository;

import org.example.jwtlogin.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User , Integer> {

    @Query("SELECT c FROM User c WHERE c.username = :username")
    Optional<User> findByUsername(String username);

}
