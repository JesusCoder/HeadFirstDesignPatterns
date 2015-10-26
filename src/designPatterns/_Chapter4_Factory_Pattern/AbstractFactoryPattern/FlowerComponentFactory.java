package designPatterns._Chapter4_Factory_Pattern.AbstractFactoryPattern;

public interface FlowerComponentFactory {

	public String createName();
	public String chooseColor();
	public String determineOrigin();
	public int finalCount();
	
}
