package cn.gok.service;

import cn.gok.entity.Department;
import cn.gok.entity.Employee;

import java.util.List;

/**
 * @author: hq
 * @create time:2020/9/11 11:06
 * @create time:2020/9/11 11:06
 * @desc:
 */

public interface EmployeeService {
    void add(Employee employee);
    void edit(Employee employee);
    void remove(String sn);
    Employee get(String sn);
    List<Employee> getAll();
}
