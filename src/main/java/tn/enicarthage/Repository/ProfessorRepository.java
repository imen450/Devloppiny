package tn.enicarthage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.professor;
@Repository
public interface ProfessorRepository extends JpaRepository<professor,Long> {

}
