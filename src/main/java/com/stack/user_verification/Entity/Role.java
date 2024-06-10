package com.stack.user_verification.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="role_table")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int role_id;
    private String name;

//    @OneToMany(mappedBy = "role_id")
//    private List<User> user;
}
