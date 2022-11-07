package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENT")
	private int idClient;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "PRENOM")
	private String prenom;

	@Column(name = "DATE_DE_NAISSANCE")
	private Date dateNaissance;

	@Embedded
	private Adresse adresse;

	// un clients peut avoir plusieurs banques
	@ManyToOne
	@JoinColumn(name = "BANQUE_ID")
	private Banque banque;

	// plusieurs clients -> plusieurs comptes
	@ManyToMany
	@JoinTable(name = "CLIENT_COMPTE", 
		joinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName = "ID_CLIENT"), 
		inverseJoinColumns = @JoinColumn(name = "ID_CPT", referencedColumnName = "ID_COMPTE"))
	private List<Compte> comptes = new ArrayList<Compte>();

	/**
	 * constructeur vide
	 */
	public Client() {

	}

	/**
	 * Getter pour l'attribut nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut prenom
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter pour l'attribut prenom
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter pour l'attribut dateNaissance
	 * 
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Setter pour l'attribut dateNaissance
	 * 
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Getter pour l'attribut adresse
	 * 
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Setter pour l'attribut adresse
	 * 
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter pour l'attribut banque
	 * 
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * Setter pour l'attribut banque
	 * 
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * Getter pour l'attribut comptes
	 * 
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * Setter pour l'attribut comptes
	 * 
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

}
