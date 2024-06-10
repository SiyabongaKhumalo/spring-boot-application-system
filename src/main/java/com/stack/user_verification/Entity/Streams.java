package com.stack.user_verification.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="streams_table")
public class Streams {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int streamsid;
    private String name;
}
