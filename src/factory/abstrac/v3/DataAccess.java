package factory.abstrac.v3;

import factory.abstrac.v2.IDepartment;
import factory.abstrac.v2.IUser;

/**
 * �ü򵥹���ģʽ+���������󹤳�ģʽ
 * switch����if�ǳ�����ĺö���������Ӧ�Ա仯�ϣ�ȴ�Ե���̬���ӣ����似����ȷ���ԺܺõĽ����������Ӧ�Եı仯������ά������չ��ڸ��
 * 
 * һ������Ա���û�а�ҹд����ľ�������������һ���ó���Ա�������ԣ����ɹ�����Ϊ��û�г��Թ������Բ����д�ɾ�
 * @author lchan
 * @date 2020��5��7��
 */
public class DataAccess {
	private static final String db = "Sqlserver"; //�˴��������������ļ��������������޸�
	
	public static IUser createUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*
		IUser user = null;
		switch(db) {
			case "sqlServer": user = new SqlserverUser(); break;
			case "access": user = new AccessUser(); break;
		}
		return user;*/
		return (IUser) Class.forName("factory.abstrac.v2."+db+"User").newInstance();  //���÷�����ƴ���ÿ�θĶ����case��switch
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
