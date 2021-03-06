package designPatterns._Chapter2_Observer_Pattern;

import TreeUtils.CommonUtils;

public class RelativeImpl implements Relative {
	
	private String relativeName;
	
	private CoreFamily coreFamily;
	
	private String coreFamilyName;

	private String bibleReadingProgress;
	
	private int monthsWeMarried;
	
	private int timesWeHiked;
	
	public RelativeImpl(String relativeName, CoreFamily coreFamily) {
		this.relativeName = relativeName;
		this.coreFamily = coreFamily;
	}

	@Override
	public void update(String coreFamilyNames, int hikingTimes, int marriedMonths, String bibleReadingProgress) {
		CommonUtils.print("Before updating:\n");
		display();
		this.bibleReadingProgress = bibleReadingProgress;
		this.coreFamilyName = coreFamilyNames;
		this.monthsWeMarried = marriedMonths;
		this.timesWeHiked = hikingTimes;
		CommonUtils.print("After updating:\n");
		display();
	}

	private void display() {
		System.out.println("Current CoreFamilyAttributes are, coreFamilyName is: " + coreFamilyName + "\tbibleReadingProgress is: "
				+ bibleReadingProgress + "\tmonthsWeMarried is: " + monthsWeMarried + "\ttimesWeHiked is: " + timesWeHiked);
	}

}
