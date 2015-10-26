package designPatterns._Chapter1_Strategy_Pattern;

public class CookRiceFlour implements CookBehavior {

	@Override
	public void cook() {
		System.out.println("I'm cooking MiFen, aka, Rice Flour.");
	}

}
