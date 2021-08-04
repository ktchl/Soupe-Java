package soup3;

abstract class Vegetable implements Calories {

	protected Double poids;

	protected static Double epluchure = 0.1;

	protected Double getPeelingWeight() {
		return poids * epluchure;
	}

}
