package com.stack.user_verification.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Date;
import java.util.List;

public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String qualification_id;
    private String name;
    private String institutionName;
    private Date awardedDate;

//    @ManyToMany(mappedBy = "qualification")
//    private List<User> user;
}
