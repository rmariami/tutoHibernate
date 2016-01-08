package fr.rmariami.tutoHibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.security.acl.Group;
import java.util.Collection;

/**
 * Created by pretender on 07/01/16.
 */
@Entity
public class Employe implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeEmploye;
    private String nomEmploye;
    @ManyToOne
    @JoinColumn(name = "CODE_EMP_SUP")
    private Employe employeSup;
    @ManyToMany
    @JoinTable(name = "EMP_GR",
            joinColumns = @JoinColumn(name = "CODE_EMP"),
            inverseJoinColumns = @JoinColumn(name = "CODE_GR"))
    private Collection<Groupe> groupes;

}
