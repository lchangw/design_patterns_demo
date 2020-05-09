package factory.abstrac.v2;

import factory.abstrac.v1.User;

public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("��SQL Server User�����һ����¼");
	}

	@Override
	public IUser get(int id) {
		System.out.println("��SQL Server User���ȡһ����¼");
		return null;
	}

}
