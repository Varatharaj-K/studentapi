package io.studentapi.springstarter.controller;

import io.studentapi.springstarter.repo.StudentRepo;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Service

public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public ResponseEntity findAllStudents(String requestHeader) {
        HttpHeaders responseHeaders = new HttpHeaders();
        if(requestHeader.equals("John") ) {
            responseHeaders.set("Processed-By", "Varatharaj");
            List std = (List) studentRepo.findAll();
            return ResponseEntity.ok()
                    .headers(responseHeaders)
                    .body(std);
        } else {
            return badRequest();
        }
    }

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

    public ResponseEntity addStudent( StudentProperties std,String requestHeader) {
        if(requestHeader.equals("John") ) {
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

    public ResponseEntity updateStudent( StudentProperties std,  int id,String requestHeader) {
        if(requestHeader.equals("John") ) {
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

    public ResponseEntity deleteStudent(int id,String requestHeader) {
        if(requestHeader.equals("John") ) {
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

    public ResponseEntity badRequest() {
        JSONObject res = new JSONObject();
        res.put("status","false");
        res.put("message","Access denied");
        return ResponseEntity.badRequest()
                .body(res);
    }
}
