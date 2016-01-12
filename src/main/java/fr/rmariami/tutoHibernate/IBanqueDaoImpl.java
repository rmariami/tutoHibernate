package fr.rmariami.tutoHibernate;

import fr.rmariami.tutoHibernate.entities.*;
import org.hibernate.sql.OracleJoinFragment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by pretender on 07/01/16.
 */
public class IBanqueDaoImpl implements IBanqueDao {

    @PersistenceContext
    EntityManager em;

    public Client addClient(Client client) {
        em.persist(client);
        return client;
    }

    public Employe addEmploye(Employe employe, Long codeSup) {
        if( codeSup != null ){
            employe.setEmployeSup(em.find(Employe.class, codeSup));
        }
        em.persist(employe);
        return employe;
    }

    public Groupe addGroupe(Groupe groupe) {
        return null;
    }

    public void addEmplyeToGroupe(Long codeEmp, Long codeGr) {
        Employe employe = em.find(Employe.class, codeEmp);
        Groupe groupe = em.find(Groupe.class, codeGr);
        addElementToCollection(employe.getGroupes(), groupe);
        addElementToCollection(groupe.getEmployes(), employe);
    }

    private <T> void  addElementToCollection(Collection<T> collection, T o) {
        if( collection != null ){
            collection.add(o);
        }
    }

    public Compte addCompte(Compte compte, Long codeCli, Long codeEmp) {
        compte.setClient(em.find(Client.class, codeCli));
        compte.setEmploye(em.find(Employe.class, codeEmp));
        em.persist(compte);
        return compte;
    }

    public Operation addOperation(Operation operation, Long codeCpte, Long codeEmp) {
        operation.setEmploye(em.find(Employe.class, codeEmp));
        operation.setCompte(em.find(Compte.class, codeCpte));
        em.persist(operation);
        return operation;
    }

    public Compte consulterCompte(String codeCpte) {
        return em.find(Compte.class, codeCpte);
    }

    public List<Operation> consulterOperations(String codeCpte) {
        return null;
    }

    public Client consulterClient(Long codeCli) {
        return null;
    }

    public List<Client> consulterClients(String mc) {
        return null;
    }

    public List<Compte> getComptesByClient(Long codeCli) {
        return null;
    }

    public List<Compte> getComptesByEmploye(Long codeEmp) {
        return null;
    }

    public List<Employe> getEmployes() {
        return null;
    }

    public List<Groupe> getGroupes() {
        return null;
    }

    public List<Employe> getEmployesByGroupe(Long codeGr) {
        return null;
    }
}
