package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BANQUE")
public class Banque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BANQUE")
	private int idBanque;
	
	@Column(name = "NOM")
	private String nom;

	// une banque à plusieurs clients
	@OneToMany(mappedBy = "banque")
	private List<Client> clients = new ArrayList<Client>();
	
	/**
	 * constructeur vide
	 */
	public Banque() {
		super();
	}

	/**
	 * Getter pour l'attribut nom 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
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
	
	
}
