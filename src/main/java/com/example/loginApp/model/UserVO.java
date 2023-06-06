package com.example.loginApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "UserVO")
@Getter
@Setter
public class UserVO implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String username;

    @Column
    private String password;

    @Column
    private String token;

    @Column
    private int roleId;
}
