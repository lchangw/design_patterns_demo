package factory.abstrac.v2;

import factory.abstrac.v1.User;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("��Access User�����һ����¼");
	}

	@Override
	public IUser get(int id) {
		System.out.println("��Access User�����һ����¼");
		return null;
	}

}
