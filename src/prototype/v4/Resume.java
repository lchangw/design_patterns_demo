package prototype.v4;

public class Resume implements Cloneable{

	private String name;
	private String sex;
	private int age;
	private WorkExperience work;
	
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	
	public Resume(WorkExperience work) throws CloneNotSupportedException {
		this.work = (WorkExperience) work.clone();
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
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	
}
