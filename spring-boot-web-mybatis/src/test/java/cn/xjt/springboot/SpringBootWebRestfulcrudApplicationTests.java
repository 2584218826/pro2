package cn.xjt.springboot;

import cn.xjt.springboot.dao.DepartmentDao;
import cn.xjt.springboot.dao.EmployeeDao;
import cn.xjt.springboot.entities.Department;
import cn.xjt.springboot.entities.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.List;

@SpringBootTest
class SpringBootWebRestfulcrudApplicationTests {

	@Autowired
	DepartmentDao departmentDao;

	@Autowired
	EmployeeDao employeeDao;
	@Test
	void contextLoads() {
		Collection<Department> departmentList = departmentDao.getDepartmentList();
		for (Department department : departmentList) {
			System.out.println(department);
		}
	}

//	@Test
//	void test()
//	{
//		Employee e = employeeDao.getEmployeeByid(1);
//		System.out.println(e);
//	}

}
