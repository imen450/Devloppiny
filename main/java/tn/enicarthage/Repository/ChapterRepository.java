package tn.enicarthage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.chapter;
@Repository
public interface ChapterRepository extends JpaRepository<chapter,Long> {

}
