package factory.method.v1;

public class LeiFengFactory {
	public static LeiFeng createLeiFeng(String type) {
		LeiFeng lei = null;
		switch(type) {
			case "undergraduate": lei = new Undergraduate(); break;
			case "volunteer": lei = new Volunteer(); break;
		}
		return lei;
	}
}
