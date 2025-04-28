package org.example.selimgaaloularctic7.Services;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.selimgaaloularctic7.Entity.Assurance;
import org.example.selimgaaloularctic7.Entity.Beneficiaire;
import org.example.selimgaaloularctic7.Entity.Contrat;
import org.example.selimgaaloularctic7.Repository.IAssuranceRepository;
import org.example.selimgaaloularctic7.Repository.IBeneficiaireRepository;
import org.example.selimgaaloularctic7.Repository.IContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class AssuranceServiceimpl  implements IAssuranceService{

    private final IBeneficiaireRepository beneficiaireRepository;

    private IAssuranceRepository assuranceRepository;

    private IContratRepository contratRepository;
    @Override
    public Beneficiaire ajouterBeneficiaire(Beneficiaire bf){
        return beneficiaireRepository.save(bf);
    }

    @Override
    public Assurance ajouterAssurance(Assurance a, int cinBf, String matricule){
        Contrat c = contratRepository.findByMatricule(matricule);
        Beneficiaire b = beneficiaireRepository.findByCin(cinBf);
        a.setBnf(b);
        a.setContrat(c);
        return assuranceRepository.save(a);
    }

}
