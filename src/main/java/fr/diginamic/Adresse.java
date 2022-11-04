package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	@Column(name = "NUMERO")
	private int numero;
	
	@Column(name = "RUE")
	private String rue;
	
	@Column(name = "CODE_POSTAL")
	private int codePostal;
	
	@Column(name = "VILLE")
	private String ville;

	/**
	 * Getter pour l'attribut numero 
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter pour l'attribut numero
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter pour l'attribut rue 
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Setter pour l'attribut rue
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Getter pour l'attribut codePostal 
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter pour l'attribut codePostal
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter pour l'attribut ville 
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter pour l'attribut ville
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	// génération des getters et setters
	
}
