package soup2;

public class Test {

	public static void main(String[] args) {

		Vegetable pdt = new Potatoe(0.3, 10);
		Vegetable c = new Carrot(0.25, 30);
		System.out.println(pdt);
		System.out.println(c);

		Soup s = new Soup();
		/*
		 * s.add(new Potatoe(0.3,10)); s.add(new Carrot(0.25,30));
		 * System.out.println(s);
		 * 
		 * s.add(new Potatoe(0.500)); s.add(new Potatoe(0.150)); s.add(new
		 * Carrot(0.20,25)); s.add(new Potatoe(0.450,2)); System.out.println(s);
		 */

		s.add(new Potatoe(0.3, 10));
		s.add(new Carrot(0.25, 30));
		System.out.println(s.getPeelingWeight());
		s.setPeelingWeight(0.05);
		System.out.println(s.getPeelingWeight());
		System.out.println(s);

		// TODO Auto-generated method stub

	}

}
