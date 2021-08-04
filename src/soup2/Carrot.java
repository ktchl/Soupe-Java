package soup2;

public class Carrot extends Vegetable {

	private Integer longueur = 30;

	public Carrot() {

	}

	@Override
	public Double getPeelingWeight() {
		Double poidsEpluchure = this.poids * Vegetable.epluchure;
		return poidsEpluchure;
	}

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
