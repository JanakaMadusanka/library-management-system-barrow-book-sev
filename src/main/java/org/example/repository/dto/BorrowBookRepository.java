package org.example.repository.dto;

import org.example.entity.BorrowBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowBookRepository extends JpaRepository<BorrowBookEntity,Long> {
}
