package com.example.Springboot002.repositories;

import com.example.Springboot002.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
