package factory.abstrac.v2;

import factory.abstrac.v1.Department;

public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department d) {
		System.out.println("��Access department�����һ����¼");
	}

	@Override
	public Department get(int id) {
		System.out.println("��Access department���ȡһ����¼");
		return null;
	}

}
