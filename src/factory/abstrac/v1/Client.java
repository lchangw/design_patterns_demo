package factory.abstrac.v1;

public class Client {

	public static void main(String[] args) {
		User user = new User();
		SqlserverUser server = new SqlserverUser();
		server.insert(user);
		server.get(1);
	}

}
