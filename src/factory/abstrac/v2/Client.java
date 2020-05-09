package factory.abstrac.v2;

import factory.abstrac.v1.Department;
import factory.abstrac.v1.User;

/**
 * 抽象工厂模式 -- 创建一系列相关或相互依赖对象的接口
 * 
 * 不足：如新增一个表Project的操作，就需新增IProject接口和各个数据库的实现类，还要修改IFactory和各个数据库的实现类
 * 而且，如有多处使用SqlserverFactory，若要改动数据库信息，就需改动多处
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		User user = new User();
		Department de = new Department();
		
		IFactory f1 = new SqlserverFactory();
		IUser iu =  f1.createUser();
		iu.insert(user);
		iu.get(1);
		IDepartment id = f1.createDepartment();
		id.insert(de);
		id.get(1);
		
		IFactory f2 = new AccessFactory();
		IUser iu2 = f2.createUser();
		iu2.insert(user);
		iu2.get(1);
		IDepartment id2 = f2.createDepartment();
		id2.insert(de);
		id2.get(1);
	}

}
