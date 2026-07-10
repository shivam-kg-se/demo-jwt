package com.jwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String email;
    private String name;
//    @Column(length = 30)
    private String password;

//    @CreationTimestamp()
//    @Column(updatable = false)
//    private Date crationDate;
//    @UpdateTimestamp()
//    @Column(insertable = false)
//    private Date updationDate;
}
