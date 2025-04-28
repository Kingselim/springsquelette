package org.example.selimgaaloularctic7.Services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.selimgaaloularctic7.Entity.Assurance;
import org.example.selimgaaloularctic7.Entity.Beneficiaire;
import org.example.selimgaaloularctic7.Entity.Contrat;
import org.example.selimgaaloularctic7.Entity.TypeContrat;
import org.example.selimgaaloularctic7.Repository.IBeneficiaireRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface IAssuranceService  {

    public Beneficiaire ajouterBeneficiaire(Beneficiaire bf);

    public Assurance ajouterAssurance (Assurance a, int cinBf, String matricule);

    public Contrat getContratBf (int idBf);
    public Set<Beneficiaire> getBeneficairesByType (TypeContrat typeContrat);

    public void statistiques ( );
}
