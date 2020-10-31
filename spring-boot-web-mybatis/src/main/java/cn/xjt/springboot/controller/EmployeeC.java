package cn.xjt.springboot.controller;

import cn.xjt.springboot.dao.DepartmentDao;
import cn.xjt.springboot.dao.EmployeeDao;
import cn.xjt.springboot.entities.Department;
import cn.xjt.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.Collection;
import java.util.List;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/4-14:27
 */

@Controller
public class EmployeeC {

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	DepartmentDao departmentDao;

	@RequestMapping("/getList")
//	@ResponseBody
	public String list(Model model)
	{
//		Collection<Employee> employees = employeeDao.getAll();
		Collection<Employee> employees = employeeDao.getEmployeeList();
//		for (Employee employee : employees) {
//			System.out.println(employee.getDepartment());
//		}
		model.addAttribute("emp", employees);

		Collection<Department> departmentList = departmentDao.getDepartmentList();
		model.addAttribute("department", departmentList);
//		System.out.println(employees);
//		return employees.toString();
		return "emp/list";
	}

	@GetMapping("/add")
	public String save(Model model)
	{
//		Collection<Department> departments = departmentDao.getDepartments();
//		model.addAttribute("d", departments);
		Collection<Department> departments = departmentDao.getDepartmentList();
		model.addAttribute("d", departments);
		return "emp/add";
	}
	@PostMapping("/add")
	public String add(Employee employee)
	{
		System.out.println(employee);
//		employeeDao.save(employee);
		employeeDao.addEmployee(employee);
		return "redirect:/getList";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") Integer id,Model model)
	{
//		System.out.println(id);
//		Employee employee = employeeDao.get(id);
		Employee employee = employeeDao.getEmployeeByid(id);
		System.out.println(employee);
		model.addAttribute("emp", employee);
//		Collection<Department> departments = departmentDao.getDepartments();
		Collection<Department> departments = departmentDao.getDepartmentList();
		System.out.println(departments);
		model.addAttribute("d", departments);
		return "emp/update";
	}

	@PostMapping("/update")
	public String update(Employee employee)
	{
		System.out.println(employee);
//		employeeDao.save(employee);
		employeeDao.updateEmployee(employee);
		return "redirect:/getList";
	}

	@GetMapping("/delete/{id}")
	public  String delete(@PathVariable("id") Integer id)
	{
//		employeeDao.delete(id);
		employeeDao.deleteEmployee(id);
		return "redirect:/getList";
	}
}
