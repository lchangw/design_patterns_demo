package factory.abstrac.v2;

import factory.abstrac.v1.User;

public interface IUser {
	void insert(User user);
	IUser get(int id);
}
