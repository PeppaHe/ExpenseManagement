package cn.gok.dao;

import cn.gok.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: hq
 * @create time:2020/9/9 17:05
 * @desc:  ���ŵ���ɾ�Ĳ�
 */
@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void update(Department department);
    void delete(String sn);
    Department select(String sn);
    List<Department> selectAll();
}
