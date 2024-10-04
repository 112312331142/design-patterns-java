package pattern.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStu(student);

        //克隆奖状对象
        Citation citation1 = citation.clone();
        Student student1 = citation1.getStu();
        student1.setName("李四");

/*
        citation1.setName("张三");
        citation.setName("高鑫");
*/


        //调用show方法展示奖状
        citation1.show();
        citation.show();
    }
}
