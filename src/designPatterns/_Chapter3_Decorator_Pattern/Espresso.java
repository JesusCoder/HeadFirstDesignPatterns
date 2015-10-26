package designPatterns._Chapter3_Decorator_Pattern;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
