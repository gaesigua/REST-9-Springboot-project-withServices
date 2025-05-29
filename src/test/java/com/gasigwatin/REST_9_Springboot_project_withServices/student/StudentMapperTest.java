package com.gasigwatin.REST_9_Springboot_project_withServices.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {

    @BeforeEach
    void setUp() {

        System.out.println("This is inside the Before Each Method!");

    }

    @AfterEach
    void tearDown() {
        System.out.println("This is inside the After Each Method!");
    }

    @Test
    public void testMethod1() {
        System.out.println("This is inside the Test Method 1");

    }

    @Test
    public void testMethod2(){
        System.out.println("This is inside the Test Method 2");

    }
}