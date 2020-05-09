package factory.abstrac.v2;

import factory.abstrac.v1.Department;

public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department d) {
		System.out.println("��SQL Server department�����һ����¼");
	}

	@Override
	public Department get(int id) {
		System.out.println("��SQL Server department���ȡһ����¼");
		return null;
	}

}
