package fr.rmariami.tutoHibernate.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by pretender on 07/01/16.
 */
@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation{
}
