package cn.gok.controller;

import cn.gok.entity.Employee;
import cn.gok.global.Contant;
import cn.gok.service.DepartmentService;
import cn.gok.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author: hq
 * @create time:2020/9/9 17:33
 * @desc:  部门控制器
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Qualifier("employeeService")
    @Autowired
   private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

//    @Autowired
//    private DataSource dataSource;
//    @Test
//    public void test() throws SQLException {
//        System.out.println(dataSource.getConnection());
//    }

    //展示所有部门
    @RequestMapping("/list")
    public String list(Map<String,Object>map){
        map.put("list",employeeService.getAll());
        return "employee_list";
    }

    //添加
    @RequestMapping("/to_add")
    public String to_add(Map<String,Object>map){
        map.put("employee", new Employee());
        //将部门的选项放进去
        map.put("dlist",departmentService.getAll());
        map.put("plist", Contant.getPost());
        return "employee_add";
    }
    @RequestMapping("/add")
    public String add(Employee employee){
        employeeService.add(employee);
        return "redirect:/employee/list";
    }

    //修改
    @RequestMapping(value = "/to_update", params = "sn")
    public String to_update(String sn, Map<String,Object>map){
        map.put("employee", employeeService.get(sn));
        map.put("dlist",departmentService.getAll());
        map.put("plist", Contant.getPost());
        return "employee_update";
    }
    @RequestMapping("/update")
    public String update(Employee employee){
        employeeService.edit(employee);
        return "redirect:/employee/list";
    }

    //删除
    @RequestMapping(value = "/remove", params = "sn")
    public String remove(String sn){
        employeeService.remove(sn);
        return "redirect:/employee/list";
    }
}
