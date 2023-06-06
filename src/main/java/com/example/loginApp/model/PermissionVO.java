package com.example.loginApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PermissionVO")
@Getter
@Setter
public class PermissionVO {
    @Id
    @Column
    private int id;

    @Column
    private String name;
}
