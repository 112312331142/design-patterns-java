package behavior.iterator;

import java.util.ArrayList;
import java.util.List;

//具体聚合对象
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list=new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    //获取迭代器对象
    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
