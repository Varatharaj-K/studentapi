package io.studentapi.springstarter.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service

public class StudentService {

    private List<StudentProperties> students =  Arrays.asList(
                new StudentProperties("20","Raj","90"),
                new StudentProperties("61","Anbu","99"),
                new StudentProperties("56","Muthu","90")
                );
    public List<StudentProperties> getAllStudents() {
        return students;
    }

    public StudentProperties getStudentById( String id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst().get();
    }

    public String addStudent(StudentProperties std){
        return "Created";
    }

    public String updateStudent(StudentProperties std, String id) {
        return "Updated";
    }

    public String deleteStudent(String id) {
        return "Deleted";
    }
}
