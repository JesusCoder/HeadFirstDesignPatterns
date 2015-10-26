package designPatterns._Chapter4_Factory_Pattern.FactoryPattern;

import designPatterns._Chapter4_Factory_Pattern.Flower;

/**The Factory Pattern defines an interface for creating an object, but lets subclasses decide which class
 * to instantiate. Factory method lets a class defer instantiation to subclass.*/

/**Design principle:
 * Depend upon abstractions. Do not depend upon CONCRETE classes.*/

public class FactoryPatternTestDrive {

	/**Coded this package on 10/04/2015 for fun. Cool!*/
	public static void main(String... args){
		FlowerFactory chineseFactory = new ChineseFlowerFactory();
		FlowerFactory americanFactory = new AmericanFlowerFactory();
		
		Flower flower = chineseFactory.produceFlower("rose");
		
		flower = americanFactory.produceFlower("lily");
	}
}
