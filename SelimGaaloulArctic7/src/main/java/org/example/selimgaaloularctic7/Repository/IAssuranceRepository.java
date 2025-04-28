package org.example.selimgaaloularctic7.Repository;

import org.example.selimgaaloularctic7.Entity.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAssuranceRepository  extends JpaRepository<Assurance,Integer> {
}
