package org.example.selimgaaloularctic7.Repository;

import org.example.selimgaaloularctic7.Entity.Beneficiaire;
import org.example.selimgaaloularctic7.Entity.Contrat;
import org.example.selimgaaloularctic7.Entity.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface IBeneficiaireRepository extends JpaRepository<Beneficiaire,Integer> {
    public Beneficiaire findByCin(int cin);

    @Query("select ass.contrat from Beneficiaire be" +
            " join be.assurances ass where be.idBenef =:idBf" +
            " order by ass.contrat.dateEffet asc limit 1")
    public Contrat getContratBf (int idBf);

    @Query("select bf from Beneficiaire bf join bf.assurances ass where ass.contrat.typeContrat =:typeContrat")
    public Set<Beneficiaire> getBeneficairesByType(TypeContrat typeContrat);
}
