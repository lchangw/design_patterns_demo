package prototype.v4;

/**
 * 深复制
 * @author lchan
 * @date 2020年5月6日
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume r1 = new Resume("lilin");
		r1.setPersonalInfo("man", 29);
		r1.setWorkExperience("2019-2020", "XX公司");
		
		Resume r2 = (Resume) r1.clone();
		r2.setWorkExperience("2018-2019", "YY公司");
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}

}
