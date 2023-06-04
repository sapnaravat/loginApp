package com.example.loginApp.repository;

import com.example.loginApp.model.PermissionVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepo extends JpaRepository<PermissionVO, Long> {
}
