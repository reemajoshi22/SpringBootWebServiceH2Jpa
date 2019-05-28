package com.learning.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "ID",nullable =false)
    @GeneratedValue
    int user_id;

    @Column(name = "user_name")
    String userName;

    @Column(name = "password")
    String password;
}
