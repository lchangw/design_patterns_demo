package factory.abstrac.v2;

import factory.abstrac.v1.Department;

public interface IDepartment {
	void insert(Department d);
	Department get(int id);
}
