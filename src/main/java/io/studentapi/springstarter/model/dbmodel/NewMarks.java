package io.studentapi.springstarter.model.dbmodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NewMarks {

    @Id
    @GeneratedValue
    private Long newMarkId;

    private Long maths;

    private Long science;

    public Long getNewMarkId() {
        return newMarkId;
    }

    public void setNewMarkId(Long newMarkId) {
        this.newMarkId = newMarkId;
    }

    public Long getMaths() {
        return maths;
    }

    public void setMaths(Long maths) {
        this.maths = maths;
    }

    public Long getScience() {
        return science;
    }

    public void setScience(Long science) {
        this.science = science;
    }
}
