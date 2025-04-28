package org.example.selimgaaloularctic7.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;

    private String matricule;

    @Temporal(TemporalType.DATE)
    private Date dateEffet;

    @Enumerated(EnumType.STRING)
    private TypeContrat typeContrat;



    // Getters et setters
}
