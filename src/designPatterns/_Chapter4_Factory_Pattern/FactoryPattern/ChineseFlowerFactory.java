package designPatterns._Chapter4_Factory_Pattern.FactoryPattern;

import designPatterns._Chapter4_Factory_Pattern.Flower;

public class ChineseFlowerFactory extends FlowerFactory {

	@Override
	protected Flower produceFlower(String type) {
		if(type.equals("rose")){
			return new ChineseStyleRose();
		} else if(type.equals("lily")){
			return new ChineseStyleLily();
		} else return null;
	}

}
