package com.emoney.banking.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    private Long id;

    private LocalDateTime time;
    private Long senderId;
    private Long receiverId;
    private float amount;
    private TransactionType type;
}
