package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowBook {
    private Long id;
    private Long borrowId;
    private String bookId;
    private Date date;
    private String fine;
}
