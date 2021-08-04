package soup3;

public class Potatoe extends Vegetable {
	
	
	private Integer yeux = 10;
	
	public Potatoe() {
		
		
	}
	

	public Potatoe(Double poids, Integer yeux) {
		
		this.poids = poids;
		this.yeux = yeux;
		
	}
	
	public Potatoe(Double poids) {
		
		this.poids = poids;
		this.yeux = (int) (poids * 10);
		
	}
	
	public Double getPoids() {
		
		return this.poids;
	}
	
	public void setPoids(Double poids) {
		
		this.poids = poids;
	}
	
	public Integer getYeux() {
		
		return this.yeux;
	}
	
	public void setYeux(Integer yeux) {
		
		this.yeux = yeux;
	}
	
	public String toString() {
		
		return "Patate: ["+poids+" kg - "+yeux+" yeux]";
		
		
	}


	@Override
	public Double getPeelingWeight() {
		
		Double poidsEpluchure = (this.poids * Vegetable.epluchure) + this.yeux * 0.01 ;
		return poidsEpluchure;
		
		
	}

}
