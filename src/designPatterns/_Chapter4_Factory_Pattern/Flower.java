package designPatterns._Chapter4_Factory_Pattern;

import TreeUtils.CommonUtils;
import lombok.Getter;

public abstract class Flower {

	@Getter	protected String name;
	@Getter	protected String color;
	@Getter	protected int count;
	@Getter protected String origin;
	
	public void water() {
		CommonUtils.print("It's watering the flower.");
	}

	public void bundle() {
		CommonUtils.print("It's bundling the flower.");		
	}

	public void ship() {
		CommonUtils.print("It's shipping the flower.");
	}

	public void ready() {
		CommonUtils.print("The flower is now ready for show!.");
	}

}
