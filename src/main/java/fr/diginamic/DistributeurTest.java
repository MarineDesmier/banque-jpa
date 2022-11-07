package fr.diginamic;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DistributeurTest {

	public static void main(String[] args) {
		// Insérer des données dans la BDD
		
		EntityManagerFactory entityManaFact = Persistence.createEntityManagerFactory("banque_tp4");
		EntityManager em = entityManaFact.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		// insertions d'information dans la bdd
		
		Banque bk1 = new Banque();
		bk1.setNom("Crédit mutuel");
		
		Banque bk2 = new Banque();
		bk2.setNom("Crédit agricole");
		
		Banque bk3 = new Banque();
		bk3.setNom("Crédit lyonnais");
		
		em.persist(bk1);
		em.persist(bk2);
		em.persist(bk3);
		
		Compte cptMarine = new Compte();
		cptMarine.setNumero("1258m77");
		cptMarine.setSolde(1500);
		em.persist(cptMarine);
		
		Compte cptOceane = new Compte();
		cptMarine.setNumero("9454ty22");
		cptMarine.setSolde(3500);
		em.persist(cptOceane);
		
		Calendar calop1 = Calendar.getInstance();
		calop1.set(2022, 10, 7);
		
		Calendar calop2 = Calendar.getInstance();
		calop1.set(2022, 10, 1);
		
		Operation op1 = new Operation();
		op1.setDateOperation(calop1.getTime());
		op1.setMontant(250.30);
		op1.setMotif("aide maman");
		op1.setCompte(cptMarine);
		em.persist(op1);
		
		Operation op2 = new Operation();
		op2.setDateOperation(calop2.getTime());
		op2.setMontant(1850.70);
		op2.setMotif("salaire");
		op2.setCompte(cptOceane);
		em.persist(op2);
		
		Adresse adresseMarine = new Adresse();
		adresseMarine.setNumero(91);
		adresseMarine.setRue("rue Rambuteau");
		adresseMarine.setCodePostal(71000);
		adresseMarine.setVille("Mâcon");
		
		Adresse adresseOceane = new Adresse();
		adresseOceane.setNumero(7);
		adresseOceane.setRue("rue desirée");
		adresseOceane.setCodePostal(69001);
		adresseOceane.setVille("Lyon");
		
		Client cli1 = new Client();
		cli1.setNom("DESMIER");
		cli1.setPrenom("Marine");
		
		Calendar cal = Calendar.getInstance(); // le calendrier commence à 0 pour janvier
		cal.set(1993, 1, 12);
		
		cli1.setDateNaissance(cal.getTime());
		cli1.setAdresse(adresseMarine);
		cli1.setBanque(bk1);
		cli1.getComptes().add(cptMarine);
		
		em.persist(cli1);
		
		Client cli2 = new Client();
		cli2.setNom("GENOUD");
		cli2.setPrenom("Océane");
		
		Calendar cal2 = Calendar.getInstance(); // le calendrier commence à 0 pour janvier
		cal2.set(1997, 0, 6);
		
		cli2.setDateNaissance(cal2.getTime());
		cli2.setAdresse(adresseOceane);
		cli2.setBanque(bk2);
		cli2.getComptes().add(cptOceane);
		em.persist(cli2);
		
		transaction.commit();
	}

}
