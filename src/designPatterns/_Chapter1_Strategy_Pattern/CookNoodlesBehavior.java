package designPatterns._Chapter1_Strategy_Pattern;

public class CookNoodlesBehavior implements CookBehavior {

	@Override
	public void cook() {
		System.out.println("I'm also fond of cooking Chinese noodles!");
	}

}
