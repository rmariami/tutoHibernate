package fr.rmariami.tutoHibernate;

import fr.rmariami.tutoHibernate.entities.*;

import java.util.List;

/**
 * Created by pretender on 07/01/16.
 */
public interface IBanqueDao {

    Client addClient(Client client);

    Employe addEmploye(Employe employe, Long codeSup);

    Groupe addGroupe(Groupe groupe);

    void addEmplyeToGroupe(Long codeEmp, Long codeGr);

    Compte addCompte(Compte compte, Long codeCli, Long codeEmp);

    Operation addOperation(Operation operation, Long codeCpt, Long codeEmp);

    Compte consulterCompte(String codeCpte);

    List<Operation> consulterOperations(String codeCpte);

    Client consulterClient(Long codeCli);

    List<Client> consulterClients(String mc);

    List<Compte> getComptesByClient(Long codeCli);

    List<Compte> getComptesByEmploye(Long codeEmp);

    List<Employe> getEmployes();

    List<Groupe> getGroupes();

    List<Employe> getEmployesByGroupe(Long codeGr);
}
