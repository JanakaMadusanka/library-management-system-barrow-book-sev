package org.example.service;

import org.example.dto.BorrowBook;
import org.example.entity.BorrowBookEntity;
import java.util.List;

public interface BorrowBookService {
    void saveDetails(BorrowBook borrowBook);
    List<BorrowBookEntity> getAll();
}
