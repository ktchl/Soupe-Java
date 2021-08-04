package soup2;

import java.util.ArrayList;

public class Soup {
	
	ArrayList<Vegetable> arraylist = new ArrayList<Vegetable>();
	
	
	
	
	public Soup() {
		
		
	}
	
	public Double getPeelingWeight() {
		
		Double poids = 0.0;
		
		for( Vegetable value : arraylist ) {
			
            poids +=  value.getPeelingWeight();
        }
		
		
		return poids;
	}
	
	
	public void setPeelingWeight(Double pourcentage) {
		
		Vegetable.epluchure = pourcentage;
		
	}
	
	
	public void add(Vegetable v) {
		arraylist.add(v);
		
	}

	
	
	public String toString()
	{
	    StringBuilder result = new StringBuilder();
	    result.append("Soup: ");
	    result.append("\n\n");

	    for(Vegetable v : arraylist)
	    {
	        result.append(v+"\n");
	        
	    }

	    
	    return result.toString();
	}


	
	

}
