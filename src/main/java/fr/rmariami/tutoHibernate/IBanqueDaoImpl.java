package fr.rmariami.tutoHibernate;

import fr.rmariami.tutoHibernate.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by pretender on 07/01/16.
 */
public class IBanqueDaoImpl implements IBanqueDao {

    @PersistenceContext
    EntityManager em;

    public Client addClient(Client client) {
        return null;
    }

    public Employe addEmploye(Employe employe, Long codeSup) {
        return null;
    }

    public Groupe addGroupe(Groupe groupe) {
        return null;
    }

    public void addEmplyeToGroupe(Long codeEmp, Long codeGr) {

    }

    public Compte addCompte(Compte compte) {
        return null;
    }

    public Operation addOperation(Operation operation, Long codeCpt, Long codeEmp) {
        return null;
    }

    public Compte consulterCompte(String codeCpte) {
        return null;
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
