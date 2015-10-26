package designPatterns._Chapter4_Factory_Pattern.FactoryPattern;

import designPatterns._Chapter4_Factory_Pattern.Flower;

public class ChineseStyleFlower extends Flower{

	public ChineseStyleFlower() {
		name = "Chinese style flowers";
		color = "Chinese red";
		count = 99;
		origin = "China";
	}
}
