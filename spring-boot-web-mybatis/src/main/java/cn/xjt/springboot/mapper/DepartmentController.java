package cn.xjt.springboot.mapper;

import cn.xjt.springboot.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/5-18:41
 */

@Mapper
@Repository
public interface DepartmentController {

	public String getDepartmentName(int id);

	public Collection<Department> getDepartmentList();
}
