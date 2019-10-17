package io.studentapi.springstarter.controller;

import io.studentapi.springstarter.repo.StudentRepo;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {
    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    //    Autowire bean on the setter method
    @Autowired
//  Creates Repo object to to database operations
    StudentRepo studentRepo;

//   Returns all student details
    public ResponseEntity findAllStudents(String requestHeader) {
//        header object to set headers
        HttpHeaders responseHeaders = new HttpHeaders();
//        Checks the request header. If the request is comes from jon it will returns the data or else it will return 400 error message
        if(requestHeader.equals("John") ) {
            responseHeaders.set("Processed-By", "Varatharaj");
//            findAll()  method helps to fetch all the data from the database
            List std = (List) studentRepo.findAll();
            return ResponseEntity.ok()
                    .headers(responseHeaders)
                    .body(std);
        } else {
            return badRequest();
        }
    }

//    Returns single student detail
    public ResponseEntity getStudent( int id,String requestHeader) {
        HttpHeaders responseHeaders = new HttpHeaders();
        if(requestHeader.equals("John") ) {
            StudentProperties std = studentRepo.findOne(id);
            responseHeaders.set("Processed-By", "Varatharaj");
            return ResponseEntity.ok()
                    .headers(responseHeaders)
                    .body(std);
        } else {
            return badRequest();
        }
    }

//    Adds the new student entry
    public ResponseEntity addStudent( StudentProperties std,String requestHeader) {
        if(requestHeader.equals("John") ) {
//            save() method helps to save data directly to the database
            studentRepo.save(std);
            JSONObject res = new JSONObject();
            res.put("status", "true");
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("Processed-By", "Varatharaj");
            return ResponseEntity.ok()
                    .headers(responseHeaders)
                    .body(res);
        } else {
            return badRequest();
        }
    }

    //    Updates the previous student if it was exist or else it will creates the new student record
    public ResponseEntity updateStudent( StudentProperties std,  int id,String requestHeader) {
        if(requestHeader.equals("John") ) {
//            Here we can delete the record first and insert as a new one
            studentRepo.delete(id);
            studentRepo.save(std);
            JSONObject res = new JSONObject();
            res.put("status", "true");
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("Processed-By", "Varatharaj");
            return ResponseEntity.ok()
                    .headers(responseHeaders)
                    .body(res);
        } else {
            return badRequest();
        }
    }

//  Deletes the record if already exist
    public ResponseEntity deleteStudent(int id,String requestHeader) {
        if(requestHeader.equals("John") ) {
//            delete() method helps to delete fields directly from the database
            studentRepo.delete(id);
            JSONObject res = new JSONObject();
            res.put("status", "true");
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("Processed-By", "Varatharaj");
            return ResponseEntity.ok()
                    .headers(responseHeaders)
                    .body(res);
        } else {
           return badRequest();
        }
    }

//    It returns 400 message
    public ResponseEntity badRequest() {
        JSONObject res = new JSONObject();
        res.put("status","false");
        res.put("message","Access denied");
        return ResponseEntity.badRequest()
                .body(res);
    }
}
