package io.studentapi.springstarter.controller;
public class StudentProperties {
    private String id;
    private String name;
    private String marks;

    public StudentProperties() {
    }

    public StudentProperties(String id,String name,String marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String getId() {
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

    public String getMarks() {
        return this.marks;
    }

    public void setMarks() {
        this.marks = marks;

    }
}
