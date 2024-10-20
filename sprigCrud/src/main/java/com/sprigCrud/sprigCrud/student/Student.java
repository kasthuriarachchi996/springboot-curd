package com.sprigCrud.sprigCrud.student;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBarth;
    private String email;
    private int age;
    public int getAge() {
        return Period.between(this.dateOfBarth, LocalDate.now()).getYears();
    }
}


