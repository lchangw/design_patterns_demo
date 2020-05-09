package factory.abstrac.v2;

import factory.abstrac.v1.Department;

public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department d) {
		System.out.println("在SQL Server department表添加一条记录");
	}

	@Override
	public Department get(int id) {
		System.out.println("在SQL Server department表获取一条记录");
		return null;
	}

}
