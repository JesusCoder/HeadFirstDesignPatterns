package designPatterns._Chapter4_Factory_Pattern.FactoryPattern;

import TreeUtils.CommonUtils;
import designPatterns._Chapter4_Factory_Pattern.Flower;

public class ChineseStyleLily extends Flower {

	public ChineseStyleLily() {
		CommonUtils.print("This is a Chinese style lily.");
	}
}
