package designPatterns._Chapter4_Factory_Pattern.FactoryPattern;

import designPatterns._Chapter4_Factory_Pattern.Flower;

public abstract class FlowerFactory {

	public Flower orderFlower(String type){
		Flower flower;
		
		flower = produceFlower(type);
		
		flower.water();
		flower.bundle();
		flower.ship();
		flower.ready();
		
		return flower;
	}

	protected abstract Flower produceFlower(String type);
}
