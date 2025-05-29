package com.gasigwatin.REST_9_Springboot_project_withServices.student;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

//    Which Service are we testing: StudentService

    @InjectMocks
    private StudentService studentService;

//    Which dependencies are we declaring:

    @Mock
    private StudentMapper studentMapper;

    @Mock
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
    }
}