package factory.abstrac.v3;

import factory.abstrac.v2.IDepartment;
import factory.abstrac.v2.IUser;

/**
 * 用简单工厂模式+反射改造抽象工厂模式
 * switch或是if是程序里的好东西，但在应对变化上，却显得老态龙钟，反射技术的确可以很好的解决它们难以应对的变化，难以维护和扩展的诟病
 * 
 * 一个程序员如果没有熬夜写程序的经历，不能算是一个好程序员；不痴迷，不成功，因为他没有痴迷过，所以不会有大成就
 * @author lchan
 * @date 2020年5月7日
 */
public class DataAccess {
	private static final String db = "Sqlserver"; //此处可以利用配置文件替代，避免代码修改
	
	public static IUser createUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*
		IUser user = null;
		switch(db) {
			case "sqlServer": user = new SqlserverUser(); break;
			case "access": user = new AccessUser(); break;
		}
		return user;*/
		return (IUser) Class.forName("factory.abstrac.v2."+db+"User").newInstance();  //利用反射机制代替每次改动添加case的switch
	}
	
	public static IDepartment createDepartment() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*
		IDepartment result = null;
		switch(db) {
			case "sqlServer": result = new SqlserverDepartment(); break;
			case "access": result = new AccessDepartment(); break;
		}
		return result;*/
		return (IDepartment) Class.forName("factory.abstrac.v2."+db+"Department").newInstance();
	}
}
