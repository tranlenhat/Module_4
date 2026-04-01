package com.example.bai9.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 5, nullable = false)
    private String borrowCode;

    private String status;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private LocalDateTime createTime;

    @PrePersist
    public void prePersist(){
        this.createTime = LocalDateTime.now();
    }
}
