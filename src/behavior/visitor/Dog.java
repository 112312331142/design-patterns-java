package behavior.visitor;

//具体元素角色类
public class Dog implements Animal {
    @Override
    public void accept(Person person) {

        person.feed(this);//访问者给宠物猫喂食
        System.out.println("汪汪");
    }
}