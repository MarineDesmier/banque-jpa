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

	/**
	 * Getter pour l'attribut dateOperation 
	 * @return the dateOperation
	 */
	public Date getDateOperation() {
		return dateOperation;
	}

	/**
	 * Setter pour l'attribut dateOperation
	 * @param dateOperation the dateOperation to set
	 */
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	/**
	 * Getter pour l'attribut montant 
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * Setter pour l'attribut montant
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * Getter pour l'attribut motif 
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * Setter pour l'attribut motif
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * Getter pour l'attribut compte 
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * Setter pour l'attribut compte
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	
	
}
