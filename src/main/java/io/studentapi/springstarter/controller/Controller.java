package io.studentapi.springstarter.controller;
import io.studentapi.springstarter.model.dbmodel.Student;
import io.studentapi.springstarter.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Receive the Http request
@RestController
public class Controller {
//    Autowire bean on the setter method
    @Autowired
//    Creates a service object to serve http responses
    private StudentService studentService;

//    Receive the HTTP GET method
//    By default it maps the get method. We don't need to mention separately
    @RequestMapping("/student")
    public ResponseEntity findAllStudent(@RequestHeader("Requested-By") String requestHeader) {
        return studentService.findAllStudents(requestHeader);
    }

//    GET method with path variable
    @RequestMapping("/student/{id}")
    public ResponseEntity getStudent(@PathVariable int id,@RequestHeader("Requested-By") String requestHeader) {
        return studentService.getStudent(id,requestHeader);
    }

//    Receives POST method and request body
    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public ResponseEntity addStudent(@RequestBody Student std, @RequestHeader("Requested-By") String requestHeader) {
        return studentService.addStudent(std,requestHeader);
    }

//    Receives PUT method. Here it will receive both request body and path variable
    @RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
    public ResponseEntity updateStudent(@RequestBody Student std, @PathVariable int id, @RequestHeader("Requested-By") String requestHeader) {

        return studentService.updateStudent(std,id,requestHeader);
    }

//    Receives DELETE method with path variable
    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
    public ResponseEntity deleteStudent(@PathVariable int id,@RequestHeader("Requested-By") String requestHeader) {
       return  studentService.deleteStudent(id,requestHeader);

    }
}
