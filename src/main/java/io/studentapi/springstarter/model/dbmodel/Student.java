package io.studentapi.springstarter.model.dbmodel;


import javax.persistence.*;
import java.util.List;

//   Tells the database to create a table automatically
//    Here table name is STUDENT_PROPERTIES and fields are id,name and marks
@Entity
public class Student {
//    Indicates id as a primary key
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int marks;

    @OneToMany(cascade = CascadeType.ALL)
    private List<NewMarks> newMarks;


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

    public List<NewMarks> getNewMarks() {
        return newMarks;
    }

    public void setNewMarks(List<NewMarks> newMarks) {
        this.newMarks = newMarks;
    }
}
