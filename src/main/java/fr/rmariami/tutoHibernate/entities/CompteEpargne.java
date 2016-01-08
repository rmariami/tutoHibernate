package fr.rmariami.tutoHibernate.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by pretender on 07/01/16.
 */
@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
    private double taux;


    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
