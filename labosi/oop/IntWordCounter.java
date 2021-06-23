package lab1;

public class IntWordCounter implements IntWordVisitor{
	private int intCount;
	private int wordCount;
	public IntWordCounter() {
		this.intCount = 0;
		this.wordCount = 0;
	}
	public int getIntCount() {
		return this.intCount;
	}
	public int getWordCount() {
		return this.wordCount;
	}
	public void fountInt(int x) {
		this.intCount++;
	}
	public void foundWord(String s) {
		this.wordCount++;
	}
}
