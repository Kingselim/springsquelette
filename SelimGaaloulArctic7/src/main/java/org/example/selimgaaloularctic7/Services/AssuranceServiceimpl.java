package org.example.selimgaaloularctic7.Services;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.selimgaaloularctic7.Entity.Assurance;
import org.example.selimgaaloularctic7.Entity.Beneficiaire;
import org.example.selimgaaloularctic7.Entity.Contrat;
import org.example.selimgaaloularctic7.Entity.TypeContrat;
import org.example.selimgaaloularctic7.Repository.IAssuranceRepository;
import org.example.selimgaaloularctic7.Repository.IBeneficiaireRepository;
import org.example.selimgaaloularctic7.Repository.IContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
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

    @Override
    public Contrat getContratBf(int idBf) {
        Contrat c = beneficiaireRepository.getContratBf(idBf);
        System.out.println("hahahahahahhahahahahahahahahahahahahahahhahah");
        System.out.println(c);
        return beneficiaireRepository.getContratBf(idBf);
    }

    @Override
    public Set<Beneficiaire> getBeneficairesByType(TypeContrat typeContrat) {
        return beneficiaireRepository.getBeneficairesByType(typeContrat);
    }



    //@Scheduled(fixedRate = 60000) // toute les 60 secondes
    @Scheduled(cron = "*/15 * * * * *") // Exécution toutes les secondes (Seconde, Minute, Heure, Jour du mois, Mois, Jour de la semaine)
    @Override
    public void statistiques() {
    log.info("Bonjour hahahahahahahahahhaha");
    }


}
