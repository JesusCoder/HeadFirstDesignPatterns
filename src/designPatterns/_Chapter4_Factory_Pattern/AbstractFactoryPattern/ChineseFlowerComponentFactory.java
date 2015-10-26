package designPatterns._Chapter4_Factory_Pattern.AbstractFactoryPattern;

public class ChineseFlowerComponentFactory implements FlowerComponentFactory {

	@Override
	public String createName() {
		return "Chinese flower name component";
	}

	@Override
	public String chooseColor() {
		return "Choosing Chinese color to be RED";
	}

	@Override
	public String determineOrigin() {
		return "Determining origin to be China";
	}

	@Override
	public int finalCount() {
		return 99 + 100;
	}

}
