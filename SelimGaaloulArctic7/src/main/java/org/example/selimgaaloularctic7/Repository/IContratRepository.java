package org.example.selimgaaloularctic7.Repository;

import org.example.selimgaaloularctic7.Entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContratRepository extends JpaRepository<Contrat,Integer> {
    public Contrat findByMatricule(String Matricule);
}
