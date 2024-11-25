package ua.edu.ucu.student;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class StudentTest {

    @Test
    public void testStudentBuilder() {
        Student student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .birthDate(LocalDate.of(2000, 1, 1))
                .height(180)
                .group("CS-101")
                .mark(90)
                .mark(85)
                .mark(88)
                .build();

        assertEquals("John", student.getFirstName());
        assertEquals("Doe", student.getLastName());
        assertEquals(LocalDate.of(2000, 1, 1), student.getBirthDate());
        assertEquals(180, student.getHeight());
        assertEquals("CS-101", student.getGroup());
        assertEquals(Arrays.asList(90, 85, 88), student.getGrades());
    }

    @Test
    public void testToString() {
        Student student = Student.builder()
                .firstName("Jane")
                .lastName("Smith")
                .birthDate(LocalDate.of(1999, 5, 15))
                .height(165)
                .group("CS-102")
                .mark(95)
                .mark(80)
                .build();

        String expectedString = "Student(firstName=Jane, lastName=Smith, birthDate=1999-05-15, height=165, group=CS-102, grades=[95, 80])";
        assertEquals(expectedString, student.toString());
    }
}