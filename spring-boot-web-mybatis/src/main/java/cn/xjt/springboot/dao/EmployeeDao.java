package cn.xjt.springboot.dao;

import java.util.*;

import cn.xjt.springboot.entities.Department;
import cn.xjt.springboot.entities.Employee;
import cn.xjt.springboot.mapper.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDao {

	@Autowired
	EmployeeController employeec;

	public Collection<Employee> getEmployeeList()
	{
		Collection<Employee> employeeList = employeec.getEmployeeList();
		return employeeList;
	}

	public int addEmployee(Employee employee)
	{
		int i = employeec.addEmployee(employee);
		return i;
	}

	public Employee getEmployeeByid(int id)
	{
		Employee e = employeec.getEmployeeByid(id);
		return e;
	}

	public int deleteEmployee(int id)
	{
		int i = employeec.deleteEmployee(id);
		return i;
	}

	public int updateEmployee(Employee employee)
	{
		int i = employeec.updateEmployee(employee);
		return i;
	}
}
