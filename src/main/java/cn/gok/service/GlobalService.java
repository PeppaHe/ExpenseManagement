package cn.gok.service;

import cn.gok.entity.Employee;

/**
 * @author: hq
 * @create time:2020/9/12 10:16
 * @desc: Ա����¼���˳����鿴��Ϣ���޸�����
 */
public interface GlobalService {
    Employee login(String sn, String password);
    void changePassword(Employee employee);
}
