package cn.gok.service.impl;

import cn.gok.dao.EmployeeDao;
import cn.gok.entity.Employee;
import cn.gok.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author: hq
 * @create time:2020/9/12 10:16
 * @desc:
 */
@Service("globalService")
public class GlobalServiceImpl implements GlobalService {
    @Qualifier("employeeDao")
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public Employee login(String sn, String password) {
        Employee employee = employeeDao.select(sn);
        if (employee !=null && employee.getPassword().equals(password)){
            return employee;
        }
        return null;
    }

    @Override
    public void changePassword(Employee employee) {
        employeeDao.update(employee);
    }
}
