package org.example.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.BorrowBook;
import org.example.entity.BorrowBookEntity;
import org.example.repository.dto.BorrowBookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BorrowBookServiceImpl implements BorrowBookService{
    final BorrowBookRepository repository;
    final ModelMapper mapper;
    @Override
    public void saveDetails(BorrowBook borrowBook) {
        repository.save(mapper.map(borrowBook, BorrowBookEntity.class));
    }
}
