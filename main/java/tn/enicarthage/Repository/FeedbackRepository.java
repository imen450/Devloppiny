package tn.enicarthage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Feedback;


@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Long> {

}
