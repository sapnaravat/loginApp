package com.example.loginApp.repository;


import com.example.loginApp.model.RoleVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<RoleVO, Long> {
}
