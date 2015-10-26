package designPatterns._Chapter4_Factory_Pattern.FactoryPattern;

import TreeUtils.CommonUtils;
import designPatterns._Chapter4_Factory_Pattern.Flower;

public class ChineseStyleRose extends Flower {
	public ChineseStyleRose() {
		CommonUtils.print("This is a Chinese style rose.");
	}
}
