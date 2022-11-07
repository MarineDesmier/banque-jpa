package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIREMENT")
public class Virement extends Operation{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VIREMENT")
	private int idVirement;
	
	@Column(name = "BENEFICIAIRE")
	private String beneficiaire;
	
	/**
	 * constructeur vide
	 */
	public Virement() {
		
	}

	/**
	 * Getter pour l'attribut beneficiaire 
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * Setter pour l'attribut beneficiaire
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	
}
