package behavior.iterator;

public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        //添加元素
        studentAggregate.addStudent(new Student("韩立","0001"));
        studentAggregate.addStudent(new Student("叶凡","0002"));
        studentAggregate.addStudent(new Student("王林","0005"));
        studentAggregate.addStudent(new Student("萧炎","0004"));
        studentAggregate.addStudent(new Student("林动","0003"));

        //遍历聚合对象
        //1.获取迭代器对象
        StudentIterator iterator= studentAggregate.getStudentIterator();
        //2.遍历
        while(iterator.hasNext()){
            //3，获取元素
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
