package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COMPTE")
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COMPTE")
	private int idCompte;
	
	@Column(name = "NUMERO")
	private String numero;
	
	@Column(name = "SOLDE")
	private double solde;
	
	// plusieurs comptes -> plusieurs clients
	@ManyToMany(mappedBy = "clients")
	private List<Client> clients = new ArrayList<Client>();
	
	
	// un compte à plusieurs opérations
	@OneToMany(mappedBy = "compte")
	private List<Operation> operations = new ArrayList<Operation>();
	
	/**
	 * Constructeur vide
	 */
	public Compte() {
		
	}
}
