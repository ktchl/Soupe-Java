package soup1;

public class Carrot {

	private Double poids = 0.25;
	private Integer longueur = 30;

	public Carrot(Double poids, Integer longueur) {

		this.poids = poids;
		this.longueur = longueur;

	}

	public Double getPoids() {
		return poids;
	}

	public void setPoids(Double poids) {
		this.poids = poids;
	}

	public Integer getLongueur() {
		return longueur;
	}

	public void setLongueur(Integer longueur) {
		this.longueur = longueur;
	}

	public String toString() {
		return "Carotte: [" + poids + " kg - " + longueur + " cm]";
	}

}
