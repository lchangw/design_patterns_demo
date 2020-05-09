package prototype.v3;

public class Resume implements Cloneable{

	private String name;
	private String sex;
	private int age;
	private WorkExperience work;
	
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	
	public void setPersonalInfo(String sex, int age) {
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company) {
		work.timeArea = timeArea;
		work.company = company;
	}

	@Override
	public String toString() {
		return "Resume [name=" + name + ", sex=" + sex + ", age=" + age + ", timeArea=" + work.timeArea + ", company="
				+ work.company + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); //ÎóÐ´Îªthis.clone½«µ¼ÖÂStackOverflowError
	}
	
}
