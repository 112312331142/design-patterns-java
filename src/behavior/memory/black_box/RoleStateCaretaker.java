package behavior.memory.black_box;

//备忘录对象管理对象
public class RoleStateCaretaker {

    //声明备忘录RoleStateMemento类型的变量
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
