package io.studentapi.springstarter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentAppApi {
//    Entry point of the application. It will start the tomcat server.
    public  static void main(String[] args ) {
        SpringApplication.run(StudentAppApi.class, args);
    }
}
