package factory.abstrac.v2;

import factory.abstrac.v1.Department;

public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department d) {
		System.out.println("在Access department表添加一条记录");
	}

	@Override
	public Department get(int id) {
		System.out.println("在Access department表获取一条记录");
		return null;
	}

}
