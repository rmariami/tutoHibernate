package fr.rmariami.tutoHibernate.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by pretender on 07/01/16.
 */
@Entity
public class Client {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private String code;
}
