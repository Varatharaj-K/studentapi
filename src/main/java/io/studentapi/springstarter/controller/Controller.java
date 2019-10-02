package io.studentapi.springstarter.controller;

import io.studentapi.springstarter.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Controller {

    @Autowired
    StudentRepo repo;
    private StudentService studentService;

    @RequestMapping("/student")
    public List<StudentProperties> studentName() {
        return studentService.getAllStudents();
    }

    @RequestMapping("/student/{id}")
    public StudentProperties getStudent(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public String addStudent(@RequestBody StudentProperties std) {
        return studentService.addStudent(std);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
    public String updateStudent(@RequestBody StudentProperties std, String id) {
        return studentService.updateStudent(std,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
    public String deleteStudent(@PathVariable String id) {
        return studentService.deleteStudent(id);
    }

}
