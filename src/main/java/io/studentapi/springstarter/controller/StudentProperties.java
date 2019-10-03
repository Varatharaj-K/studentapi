package io.studentapi.springstarter.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//   Tells the database to create a table automatically
//    Here table name is STUDENT_PROPERTIES and fields are id,name and marks
@Entity
public class StudentProperties {
//    Indicates id as a primary key
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int marks;

    public StudentProperties() {
    }
// constructor
    public StudentProperties(int id,String name,int marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
//    Getters and Setters
    public Integer getId() {
        return this.id;
    }

    public void setId() {
        this.id = id;

    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;

    }

    public Integer getMarks() {
        return this.marks;
    }

    public void setMarks() {
        this.marks = marks;

    }
}
