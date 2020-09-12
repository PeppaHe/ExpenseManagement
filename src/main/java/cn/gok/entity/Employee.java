package cn.gok.entity;

import lombok.Data;

/**
 * @author: hq
 * @create time:2020/9/12 0:12
 * @desc:  Ô±¹¤
 */
@Data
public class Employee {
    private String sn;
    private String password;
    private String name;
    private String departmentSn;
    private String post;
    private Department department;
}
