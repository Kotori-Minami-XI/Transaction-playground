package Kotori.domain;

public class Student {
    private Integer stu_id;
    private String stu_name;
    private Integer stu_age;
    private Double stu_money;

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public void setStu_age(Integer stu_age) {
        this.stu_age = stu_age;
    }

    public Double getStu_money() {
        return stu_money;
    }

    public void setStu_money(Double stu_money) {
        this.stu_money = stu_money;
    }
}
