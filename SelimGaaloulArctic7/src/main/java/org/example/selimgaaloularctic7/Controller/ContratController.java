package org.example.selimgaaloularctic7.Controller;


import lombok.AllArgsConstructor;
import org.example.selimgaaloularctic7.Entity.Contrat;
import org.example.selimgaaloularctic7.Services.IAssuranceService;
import org.example.selimgaaloularctic7.Services.IContratService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("examen")
@RestController
public class ContratController {

    private IContratService contratService;

    @PostMapping("ajoutercontrat")
    public Contrat ajouterContrat( @RequestBody Contrat c){
        return contratService.ajouterContrat(c);
    }

}
