package org.example.selimgaaloularctic7.Controller;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.selimgaaloularctic7.Entity.Assurance;
import org.example.selimgaaloularctic7.Entity.Beneficiaire;
import org.example.selimgaaloularctic7.Services.IAssuranceService;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("examen")
@RestController
public class AssuranceController {

    private IAssuranceService assuranceService;

    @PostMapping("ajouterBeneficiaire")
    public Beneficiaire ajouterBeneficiaire( @RequestBody Beneficiaire bf){
        return assuranceService.ajouterBeneficiaire(bf);
    }

    @PostMapping("ajouterassurance")
    public Assurance ajouterAssurance(@RequestBody Assurance a, @PathVariable int cinBf,@PathVariable String matricule) {
        return assuranceService.ajouterAssurance(a,cinBf,matricule);
     }
    }
