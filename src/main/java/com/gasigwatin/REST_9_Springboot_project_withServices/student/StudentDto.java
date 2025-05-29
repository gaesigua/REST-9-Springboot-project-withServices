package com.gasigwatin.REST_9_Springboot_project_withServices.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty(message = "First Name should not be empty!")
        String firstName,

        @NotEmpty(message = "Last Name should not be empty!")
        String lastName,
        String email,
        int age,
        String creationDate,
        Integer schoolId) {
}