package com.example.bai9.Repository;

import com.example.bai9.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IBorrowRepository extends JpaRepository<Borrow,Long> {
    Optional<Borrow> findByBorrowCode(String code);
}
