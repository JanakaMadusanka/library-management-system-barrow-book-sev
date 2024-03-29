package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.BorrowBook;
import org.example.entity.BorrowBookEntity;
import org.example.service.BorrowBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class BorrowBookController {
    final BorrowBookService service;
    @PostMapping("/add-borrow-details")
    public void addBorrowDetails(@RequestBody BorrowBook borrowBook){
        service.saveDetails(borrowBook );
        log.info(borrowBook.toString());
    }
    @GetMapping("/get-all")
    public List<BorrowBookEntity> getAll(){
        return service.getAll();
    }


}
