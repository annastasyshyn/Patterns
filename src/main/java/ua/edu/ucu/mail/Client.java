package ua.edu.ucu.mail;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client {
    private static int counter;
    private final int id = counter++;
    private String name;
    private LocalDate dob;
    private String sex;
    private String email;
}
