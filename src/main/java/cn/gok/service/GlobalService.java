package cn.gok.service;

import cn.gok.entity.Employee;

/**
 * @author: hq
 * @create time:2020/9/12 10:16
 * @desc: 员工登录、退出、查看消息、修改密码
 */
public interface GlobalService {
    Employee login(String sn, String password);
    void changePassword(Employee employee);
}
