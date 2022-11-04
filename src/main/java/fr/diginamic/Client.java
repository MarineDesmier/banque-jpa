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
}
