package cn.xjt.springboot.mapper;

import cn.xjt.springboot.entities.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/5-17:57
 */

@Repository
@Mapper
public interface EmployeeController {

	public List<Employee> getEmployeeList();

	public Employee getEmployeeByid(int id);

	public int updateEmployee(Employee employee);

	public int addEmployee(Employee employee);

	public int deleteEmployee(int id);
}
