package designPatterns._Chapter3_Decorator_Pattern;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .99 + beverage.cost();
	}

}
