package cn.gok.controller;

import cn.gok.entity.Department;
import cn.gok.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author: hq
 * @create time:2020/9/9 17:33
 * @desc:  部门控制器
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Qualifier("departmentService")
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
        map.put("list",departmentService.getAll());
        return "department_list";
    }

    //添加
    @RequestMapping("/to_add")
    public String to_add(Map<String,Object>map){
        map.put("department", new Department());
        return "department_add";
    }
    @RequestMapping("/add")
    public String add(Department department){
        departmentService.add(department);
        return "redirect:/department/list";
    }

    //修改
    @RequestMapping(value = "/to_update", params = "sn")
    public String to_update(String sn, Map<String,Object>map){
        map.put("department", departmentService.get(sn));
        return "department_update";
    }
    @RequestMapping("/update")
    public String update(Department department){
        departmentService.edit(department);
        return "redirect:/department/list";
    }

    //删除
    @RequestMapping(value = "/remove", params = "sn")
    public String remove(String sn){
        departmentService.remove(sn);
        return "redirect:/department/list";
    }
}
