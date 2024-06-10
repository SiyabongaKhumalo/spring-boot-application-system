package com.stack.user_verification.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="User_table")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer userid;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    private String phoneNumber;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, unique = true)
    private String email;


//    @ManyToMany
//    @JoinTable(
//            name = "user-qualification",
//            joinColumns = @JoinColumn(name="userid")
//
//    )
//    @OneToMany(cascade =CascadeType.ALL)
//    @JoinColumn(name = "fk_userid" , referencedColumnName = "userid")
//    private List<Role> role;


}
