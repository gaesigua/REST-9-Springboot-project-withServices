package com.gasigwatin.REST_9_Springboot_project_withServices.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty
        String firstName,

        @NotEmpty
        String lastName,
        String email,
        int age,
        String creationDate,
        Integer schoolId) {
}