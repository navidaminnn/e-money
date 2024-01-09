package com.emoney.banking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    private Long id;

    private String firstName;
    private String lastName;
    
    private LocalDate dob;

    private String email;
    private String password;

    private ArrayList<Account> accounts;
}
