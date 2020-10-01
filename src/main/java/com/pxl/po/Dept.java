package com.pxl.po;

public class Dept {
    private int stu_id;
    private String stu_name;
    private String stu_sex;

    public Dept() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_sex='" + stu_sex + '\'' +
                '}';
    }

    public Dept(int stu_id, String stu_name, String stu_sex) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_sex = stu_sex;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public void setStu_sex(String stu_sex) {
        this.stu_sex = stu_sex;
    }

    public int getStu_id() {
        return stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public String getStu_sex() {
        return stu_sex;
    }
}
