package com.atguigu.spring5.bean;

//员工类
public class Emp {
    private String eName;
    private String gender;
    //员工属于某一个部门,使用对象形式表示
    private  Dept dept;

    public void seteName(String eName) {
        this.eName = eName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add(){
        System.out.println(eName + "::" + gender + "::" + dept);
    }
}