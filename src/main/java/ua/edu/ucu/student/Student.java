package ua.edu.ucu.student;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@ToString
@SuperBuilder
public class Student {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int height;
    private String group;
    @Singular("mark")
    private List<Integer> grades;
}   
