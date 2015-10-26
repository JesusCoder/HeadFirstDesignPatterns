package designPatterns._Chapter4_Factory_Pattern.FactoryPattern;

import designPatterns._Chapter4_Factory_Pattern.Flower;

public class AmericanFlowerFactory extends FlowerFactory {

	@Override
	protected Flower produceFlower(String type) {
		if(type.equals("rose")){
			return new AmericanStyleRose();
		} else if(type.equals("lily")){
			return new AmericanStyleLily();
		} else return null;
	}
}
