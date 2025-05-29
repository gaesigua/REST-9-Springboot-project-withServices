package com.gasigwatin.REST_9_Springboot_project_withServices.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentMapperTest {

//    Which Service are we testing: StudentMapper

    private StudentMapper mapper;

    @BeforeEach
    void setUp() {

       mapper = new StudentMapper();
    }

    @Test
    void shouldMapStudentDtoToStudent() {

       StudentDto dto = new StudentDto("Ora", "Kanamugire", "Ora@gmail.com", 7, "10-01-2025", 5);

       Student student = mapper.toStudent(dto);

        assertEquals(dto.firstName(), student.getFirstName());
        assertEquals(dto.lastName(), student.getLastName());
        assertEquals(dto.email(), student.getEmail());
        assertEquals(dto.age(), student.getAge());

        assertNotNull(student.getSchool());

        assertEquals(dto.schoolId(), student.getSchool().getId());

    }

    @Test
    void shouldThrow_NullPointerException_if_StudentDto_isNull() {

        var exception = assertThrows(NullPointerException.class,()-> mapper.toStudent(null));

        assertEquals("The Student Dto should not be Null.", exception.getMessage());
    }

    @Test
    void shouldMapStudentResponseDtoToStudent() {

        //Given

        Student student = new Student("Ora",
                                      "Kanamugire",
                                         "Ora@gmail.com",
                                           42,
                                     "23-03-2025");

        //When

        StudentResponseDto responseDto= mapper.toStudentResponseDto(student);

        //Then

        assertEquals(responseDto.firstName(), student.getFirstName());
        assertEquals(responseDto.lastName(), student.getLastName());


    }
}