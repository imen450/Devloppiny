package tn.enicarthage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.user;
@Repository
public interface userRepository extends JpaRepository<user,Long>{

}
