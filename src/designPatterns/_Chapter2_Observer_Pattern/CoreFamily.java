package designPatterns._Chapter2_Observer_Pattern;

public interface CoreFamily {
	public void registerRelative(Relative relative);
	public void removeRelative(Relative relative);
	public void notifyRelative();
	public void setCoreFamilyAttributes(String coreFamilyNames, int hikingTimes, int marriedMonths, String bibleReadingProgress);
}
