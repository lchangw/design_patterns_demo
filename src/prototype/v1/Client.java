package prototype.v1;

public class Client {

	public static void main(String[] args) {
		Resume r1 = new Resume("lilin");
		r1.setPersonalInfo("man", 29);
		r1.setWorkExperience("2019-2020", "XX公司");
		
		Resume r2 = new Resume("lilin");
		r2.setPersonalInfo("man", 29);
		r2.setWorkExperience("2019-2020", "XX公司");
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}

}
