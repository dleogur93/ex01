package com.example.ex01.infra;

import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String password;

}
