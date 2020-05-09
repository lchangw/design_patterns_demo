package factory.abstrac.v3;

import factory.abstrac.v1.Department;
import factory.abstrac.v1.User;
import factory.abstrac.v2.IDepartment;
import factory.abstrac.v2.IUser;

public class Client {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		User user = new User();
		Department d = new Department();
		
		IUser iu = DataAccess.createUser();
		iu.insert(user);
		iu.get(1);
		
		IDepartment id = DataAccess.createDepartment();
		id.insert(d);
		id.get(1);
	}

}
