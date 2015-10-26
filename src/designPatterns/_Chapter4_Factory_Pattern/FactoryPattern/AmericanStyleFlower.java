package designPatterns._Chapter4_Factory_Pattern.FactoryPattern;

import TreeUtils.CommonUtils;
import designPatterns._Chapter4_Factory_Pattern.Flower;

public class AmericanStyleFlower extends Flower {

	public AmericanStyleFlower() {
		count = 100;
		origin = "United States of America";
		name = "American flowers";
		color = "Blue and Red";
	}
	
	public void water(){
		CommonUtils.print("It's watering the flower in the conserving mode since we are experiencing a very severe drought throughout the US now.");
	}
}
