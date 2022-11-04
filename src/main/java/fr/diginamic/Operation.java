package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OPERATION")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_OPERATION")
	private int idOperation;
	
	@Column(name = "DATE_OPERATION")
	private Date dateOperation;
	
	@Column(name = "MONTANT")
	private double montant;
	
	@Column(name = "MOTIF")
	private String motif;
	
	// plusieurs opérations sur un compte
	@ManyToOne
	@JoinColumn(name = "COMPTE_ID")
	private Compte compte;
	
	/**
	 * Constructeur vide
	 */
	public Operation() {
		
	}
}
