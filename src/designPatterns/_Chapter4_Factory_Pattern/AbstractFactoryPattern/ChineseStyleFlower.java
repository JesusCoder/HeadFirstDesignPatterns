package designPatterns._Chapter4_Factory_Pattern.AbstractFactoryPattern;

import designPatterns._Chapter4_Factory_Pattern.Flower;

public class ChineseStyleFlower extends Flower{
	
	FlowerComponentFactory componentFactory;
	
	public ChineseStyleFlower(FlowerComponentFactory componentFactory) {
		this.componentFactory = componentFactory;
	}
}
