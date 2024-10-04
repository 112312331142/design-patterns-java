package pattern.prototype.test;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {
    //三好学生上的姓名
/*    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    private Student stu;

    public Citation() {
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show(){
        System.out.println(stu.getName()+"同学获奖");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
