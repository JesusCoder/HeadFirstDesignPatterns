package designPatterns._Chapter1_Strategy_Pattern;

public class LoveHusbandBehavior implements LoveBehavior {

	@Override
	public void showLove() {
		System.out.println("I love my husband Steve Sun, he is just awesome!");
	}

}
