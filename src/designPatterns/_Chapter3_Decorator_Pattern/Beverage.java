package designPatterns._Chapter3_Decorator_Pattern;

import lombok.Getter;

public abstract class Beverage {
	@Getter
	String description = "Unknown beverage";
	
	public abstract double cost();
}
