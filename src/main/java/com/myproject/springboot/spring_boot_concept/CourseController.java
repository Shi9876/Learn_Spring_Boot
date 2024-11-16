package com.myproject.springboot.spring_boot_concept;


//http://localhost:8080/courses
//We want to create a simple Rest API with URL/courses and when somebody hits that URL,
// we want to return the data below. So we return course details with ID, name and author from our course controller.

//[
//   {
//           "id". 1,
//           "name","Learn Spring Boot",
//           "author":"Shivanshi"
//           }
//           ]


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
//We want to build a REST API. That's why I would use the annotation REST controller.
public class CourseController {

    // /courses
    // Course: id, name, author
    @RequestMapping("/courses")        //used to map the URL "/courses" to the method Course.
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn Spring Boot", "Shivanshi"),
                new Course(2, "Learn AWS", "Suman"),
                new Course(3, "Learn Azure", "Rita")

        );
    }
}
