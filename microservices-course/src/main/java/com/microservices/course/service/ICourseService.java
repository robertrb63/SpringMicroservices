package com.microservices.course.service;

import com.microservices.course.entities.Course;
import com.microservices.course.http.response.StudentByCourseResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentByIdCourse(Long idCourse);

}