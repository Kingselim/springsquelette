package org.example.selimgaaloularctic7.Services;

import lombok.AllArgsConstructor;
import org.example.selimgaaloularctic7.Entity.Contrat;
import org.example.selimgaaloularctic7.Repository.IContratRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ContratServiceimpl  implements IContratService{

    private IContratRepository contratRepository;


    @Override
    public Contrat ajouterContrat(Contrat c){
        return contratRepository.save(c);
    }
}
