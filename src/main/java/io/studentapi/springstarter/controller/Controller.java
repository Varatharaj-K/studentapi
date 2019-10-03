package io.studentapi.springstarter.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public ResponseEntity findAllStudent(@RequestHeader("Requested-By") String requestHeader) {
        return studentService.findAllStudents(requestHeader);
    }

    @RequestMapping("/student/{id}")
    public ResponseEntity getStudent(@PathVariable int id,@RequestHeader("Requested-By") String requestHeader) {
        return studentService.getStudent(id,requestHeader);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public ResponseEntity addStudent(@RequestBody StudentProperties std,@RequestHeader("Requested-By") String requestHeader) {
        return studentService.addStudent(std,requestHeader);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
    public ResponseEntity updateStudent(@RequestBody StudentProperties std, @PathVariable int id,@RequestHeader("Requested-By") String requestHeader) {

        return studentService.updateStudent(std,id,requestHeader);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
    public ResponseEntity deleteStudent(@PathVariable int id,@RequestHeader("Requested-By") String requestHeader) {
       return  studentService.deleteStudent(id,requestHeader);

    }
}
