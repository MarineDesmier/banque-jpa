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
	@ManyToMany(mappedBy = "comptes")
	private List<Client> clients = new ArrayList<Client>();
	
	
	// un compte à plusieurs opérations
	@OneToMany(mappedBy = "compte")
	private List<Operation> operations = new ArrayList<Operation>();
	
	/**
	 * Constructeur vide
	 */
	public Compte() {
		
	}

	/**
	 * Getter pour l'attribut numero 
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Setter pour l'attribut numero
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Getter pour l'attribut solde 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter pour l'attribut solde
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter pour l'attribut clients 
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/**
	 * Setter pour l'attribut clients
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Getter pour l'attribut operations 
	 * @return the operations
	 */
	public List<Operation> getOperations() {
		return operations;
	}

	/**
	 * Setter pour l'attribut operations
	 * @param operations the operations to set
	 */
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	
	
}
