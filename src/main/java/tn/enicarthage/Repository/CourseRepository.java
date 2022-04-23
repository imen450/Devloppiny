package tn.enicarthage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.course;
@Repository
public interface CourseRepository extends JpaRepository<course,Long> {
	
}
