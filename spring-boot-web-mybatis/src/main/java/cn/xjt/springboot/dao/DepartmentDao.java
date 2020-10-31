package cn.xjt.springboot.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.xjt.springboot.entities.Department;
import cn.xjt.springboot.entities.Employee;
import cn.xjt.springboot.mapper.DepartmentController;
import cn.xjt.springboot.mapper.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
@Service
public class DepartmentDao {

	@Autowired
	DepartmentController depart;

	public Collection<Department> getDepartmentList()
	{
		Collection<Department> departmentList = depart.getDepartmentList();
		return departmentList;
	}

	public String getDepartmentName(int id)
	{
		String departmentName = depart.getDepartmentName(id);
		return departmentName;
	}
}
