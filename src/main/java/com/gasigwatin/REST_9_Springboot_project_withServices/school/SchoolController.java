package com.gasigwatin.REST_9_Springboot_project_withServices.school;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController{

        private final SchoolService schoolService;

        public SchoolController(SchoolService schoolService){
            this.schoolService = schoolService;
        }

        @PostMapping("/schools")
        public SchoolDto saveSchoolDetails(@RequestBody SchoolDto schoolDto){

            return schoolService.saveSchoolDetails(schoolDto);

        }
        //Here we don't need to expose the school (using the List<School>); instead we can

        @GetMapping("/schools")
        public List<SchoolDto> getAllSchools(){
            return schoolService.getAllSchools();
        }

        @GetMapping("/schools/search/{school-id}")
        public SchoolDto getOneSchool(@PathVariable("school-id") Integer schoolId){

            return schoolService.getOneSchool(schoolId);
        }
    }
