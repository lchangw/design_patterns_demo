package factory.abstrac.v2;

import factory.abstrac.v1.User;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在Access User表添加一条记录");
	}

	@Override
	public IUser get(int id) {
		System.out.println("在Access User表添加一条记录");
		return null;
	}

}
