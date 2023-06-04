package com.example.loginApp.repository;

import com.example.loginApp.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserVO , Long> {
    UserVO findByUsername(String username);
}
