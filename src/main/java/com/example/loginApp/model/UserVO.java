package com.example.loginApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "UserVO")
@Getter
@Setter
public class UserVO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;

    public List<RoleVO> getRoles() {
        return null;
    }
}
