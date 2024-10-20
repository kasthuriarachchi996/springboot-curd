package com.sprigCrud.sprigCrud.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBarth;
    private String email;
    private int age;
}


