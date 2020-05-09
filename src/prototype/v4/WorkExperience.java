package prototype.v4;

public class WorkExperience implements Cloneable{

	public String timeArea;
	public String company;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
