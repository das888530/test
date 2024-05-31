package com.protfolio.demo.repsitory;

import com.protfolio.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {
    @Query("Select u from User u where u.name=?1")
    List<User> findAllByName(String name);
}
