package io.studentapi.springstarter.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudentProperties {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int marks;

    public StudentProperties() {
    }

    public StudentProperties(int id,String name,int marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
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
