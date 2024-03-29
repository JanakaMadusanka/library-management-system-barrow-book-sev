package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.BorrowBook;
import org.example.service.BorrowBookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class BorrowBookController {
    final BorrowBookService service;
    @PostMapping("/add-borrow-details")
    public void addBorrowDetails(@RequestBody BorrowBook borrowBook){
        service.saveDetails(borrowBook);
    log.info(borrowBook.toString());
    }
}
