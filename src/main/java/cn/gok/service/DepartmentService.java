package cn.gok.service;

import cn.gok.entity.Department;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hq
 * @create time:2020/9/11 11:06
 * @create time:2020/9/11 11:06
 * @desc:
 */

public interface DepartmentService {
    void add(Department department);
    void edit(Department department);
    void remove(String sn);
    Department get(String sn);
    List<Department> getAll();
}
