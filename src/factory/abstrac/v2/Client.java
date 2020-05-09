package factory.abstrac.v2;

import factory.abstrac.v1.Department;
import factory.abstrac.v1.User;

/**
 * ���󹤳�ģʽ -- ����һϵ����ػ��໥��������Ľӿ�
 * 
 * ���㣺������һ����Project�Ĳ�������������IProject�ӿں͸������ݿ��ʵ���࣬��Ҫ�޸�IFactory�͸������ݿ��ʵ����
 * ���ң����жദʹ��SqlserverFactory����Ҫ�Ķ����ݿ���Ϣ������Ķ��ദ
 * @author lchan
 * @date 2020��5��7��
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
