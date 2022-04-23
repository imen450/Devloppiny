package tn.enicarthage.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

}
