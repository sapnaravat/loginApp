package com.example.loginApp.repository;

import com.example.loginApp.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserRepo extends JpaRepository<UserVO ,Integer> {

    UserVO findByToken(String token);

    UserVO findByUsr_name(String username);
}
