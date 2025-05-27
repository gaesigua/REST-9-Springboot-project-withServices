package com.gasigwatin.REST_9_Springboot_project_withServices;

public record StudentDto(String firstName,
                         String lastName,
                         String email,
                         int age,
                         String creationDate,
                         Integer schoolId) {
}