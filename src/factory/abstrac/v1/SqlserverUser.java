package factory.abstrac.v1;

public class SqlserverUser {

	public void insert(User user) {
		System.out.println("在SQL Server User表添加一条记录");
	}
	
	public User get(int id) {
		System.out.println("在SQL Server User表根据ID获取一条记录");
		return null;
	}
}
