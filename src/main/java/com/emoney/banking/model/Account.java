package com.emoney.banking.model;

import java.math.BigDecimal;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue
    private Long id;

    private int accountId;

    private int cardNumber;
    private BigDecimal balance;
    @OneToMany
    private ArrayList<Transaction> transactions;
    private AccountType type;
    @OneToOne
    private User owner;
}
