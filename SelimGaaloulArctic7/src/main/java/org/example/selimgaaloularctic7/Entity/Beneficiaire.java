package org.example.selimgaaloularctic7.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Beneficiaire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBenef;
    private int cin;
    private String nom;
    private String prenom;
    private String profession;
    private float salaire;

    //relatiom
    @OneToMany(mappedBy = "bnf")
    private Set<Assurance> assurances;

   // @ManyToOne
   // @JoinColumn(name = "assurance_id")
   // private Assurance assurance;

    // Getters et setters
}