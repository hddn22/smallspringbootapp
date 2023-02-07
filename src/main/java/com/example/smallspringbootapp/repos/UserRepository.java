package com.example.smallspringbootapp.repos;

import com.example.smallspringbootapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
