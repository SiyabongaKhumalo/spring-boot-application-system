package com.stack.user_verification.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Entity
@Data
@Table(name="province_table")
@RequiredArgsConstructor
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;





//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_userid", referencedColumnName = "userid")
//    private List<Province> province;
}
