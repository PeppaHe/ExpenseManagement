package cn.gok.service.impl;

import cn.gok.dao.DepartmentDao;
import cn.gok.dao.EmployeeDao;
import cn.gok.entity.Department;
import cn.gok.entity.Employee;
import cn.gok.service.DepartmentService;
import cn.gok.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hq
 * @create time:2020/9/11 11:07
 * @desc:
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Qualifier("employeeDao")
    @Autowired
    private EmployeeDao employeeDao;

    public void add(Employee employee) {
        //业务层设置默认密码
        employee.setPassword("000000");
        employeeDao.insert(employee);
    }

    public void edit(Employee employee) {
        employeeDao.update(employee);
    }

    public void remove(String sn) {
        employeeDao.delete(sn);
    }

    public Employee get(String sn) {
        return employeeDao.select(sn);
    }

    public List<Employee> getAll() {
        return employeeDao.selectAll();
    }
}