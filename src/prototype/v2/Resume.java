package prototype.v2;

public class Resume implements Cloneable{

	private String name;
	private String sex;
	private int age;
	private String timeArea;
	private String company;
	
	public Resume(String name) {
		this.name = name;
	}
	
	public void setPersonalInfo(String sex, int age) {
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Resume [name=" + name + ", sex=" + sex + ", age=" + age + ", timeArea=" + timeArea + ", company="
				+ company + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); //ÎóÐ´Îªthis.clone½«µ¼ÖÂStackOverflowError
	}
	
}
