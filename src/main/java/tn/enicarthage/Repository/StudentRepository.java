package tn.enicarthage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
