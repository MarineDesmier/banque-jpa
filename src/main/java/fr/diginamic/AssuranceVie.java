package fr.diginamic;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASSURANCE_VIE")
public class AssuranceVie extends Compte{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ASSURANCE_VIE")
	private int idAssuranceVie;
	
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	
	@Column(name = "TAUX")
	private double taux;

	/**
	 * constructeur vide
	 */
	public AssuranceVie() {
		
	}

	/**
	 * Getter pour l'attribut dateFin 
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Setter pour l'attribut dateFin
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter pour l'attribut taux 
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Setter pour l'attribut taux
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
}
