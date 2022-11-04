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
	@OneToMany(mappedBy = "client")
	private List<Client> clients = new ArrayList<Client>();
	
	/**
	 * constructeur vide
	 */
	public Banque() {
		super();
	}
	
	
}
