package factory.abstrac.v2;

import factory.abstrac.v1.User;

public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在SQL Server User表添加一条记录");
	}

	@Override
	public IUser get(int id) {
		System.out.println("在SQL Server User表获取一条记录");
		return null;
	}

}
