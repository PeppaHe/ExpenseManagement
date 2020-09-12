package cn.gok.dao;

import cn.gok.entity.Department;
import cn.gok.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: hq
 * @create time:2020/9/9 17:05
 * @desc:  ���ŵ���ɾ�Ĳ�
 */
@Repository("employeeDao")
public interface EmployeeDao {
    void insert(Employee employee);
    void update(Employee employee);
    void delete(String sn);
    Employee select(String sn);
    List<Employee> selectAll();
}
