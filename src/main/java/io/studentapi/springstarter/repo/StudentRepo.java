package io.studentapi.springstarter.repo;

import io.studentapi.springstarter.model.dbmodel.Student;
import org.springframework.data.repository.CrudRepository;

//  CrudRepository used to do database operations
public interface StudentRepo extends CrudRepository<Student,Integer> {

}
