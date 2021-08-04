package soup1;

public class Potatoe {
	
	private Double poids = 0.3;
	private Integer yeux = 10;
	
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

}
