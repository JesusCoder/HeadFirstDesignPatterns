package designPatterns._Chapter1_Strategy_Pattern;

public class ModelWife extends Wife {

	public ModelWife() {
		loveBehavior = new LoveHusbandBehavior();
		cookBehavior = new CookRiceFlour();
	}
	
}
