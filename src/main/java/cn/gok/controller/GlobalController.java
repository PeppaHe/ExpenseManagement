package cn.gok.controller;

import cn.gok.entity.Employee;
import cn.gok.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author: hq
 * @create time:2020/9/12 10:21
 * @desc:
 */
@Controller
@RequestMapping("")
public class GlobalController {
    @Autowired
    private GlobalService globalService;

    //登录
    @RequestMapping("/to_login")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam String sn, @RequestParam String password){
        Employee employee = globalService.login(sn,password);
        if (employee == null){
            return "redirect:/to_login";
        }
        session.setAttribute("employee",employee);
        return "redirect:/self";
    }

    //个人信息
    @RequestMapping("/self")
    public String self(){
        return "self";
    }


    //退出
    @RequestMapping("/quit")
    public String exit(HttpSession session){
        session.setAttribute("employee",null);
        return "redirect:/to_login";
    }

    //修改密码
    @RequestMapping("/to_change_password")
    public String toChangePassword(){
        return "change_password";
    }

    @RequestMapping("/change_password")
    public String changePassword(HttpSession session,@RequestParam String old,@RequestParam String new1,@RequestParam String new2){
        Employee employee = (Employee) session.getAttribute("employee");
        if (employee.getPassword().equals(old)){
            if (new1.equals(new2)){
                employee.setPassword(new1);
                globalService.changePassword(employee);
                return "redirect:/self";
            }
        }
        return "redirect:/to_change_password";
    }


}
