package io.studentapi.springstarter.controller;


import javax.persistence.*;

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


//    Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
