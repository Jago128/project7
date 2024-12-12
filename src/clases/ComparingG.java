package clases;

public class ComparingG implements Comparable<ComparingG> {
	private String classification;
	private int num;

	public ComparingG() {
		this.classification="";
		this.num=0;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int compareTo(ComparingG p) {
		return Integer.compare(this.num, p.getNum());
	}
}
