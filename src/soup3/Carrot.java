package soup3;

public class Carrot extends Vegetable implements Calories {

	private Integer calories = 40;

	private Integer longueur = 30;

	private Double poidsEpluchure = 0.0;

	public Carrot() {

	}

	@Override
	public Double getPeelingWeight() {
		this.poidsEpluchure = this.poids * Vegetable.epluchure;
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

	@Override
	public Integer getCalories() {

		return (int) ((this.poids - this.getPeelingWeight()) / pCalories * this.calories);

	}

}
