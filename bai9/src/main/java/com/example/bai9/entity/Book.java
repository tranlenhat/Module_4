    package com.example.bai9.entity;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import java.util.List;

    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Setter
    @Getter
    public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;
        private String title;
        private String author;
        private int quantity;

        @OneToMany(mappedBy = "book")
        private List<Borrow> borrows;
    }
