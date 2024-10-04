package behavior.memory.white_box;

//备忘录对象管理对象
public class RoleStateCaretaker {

    //声明备忘录RoleStateMemento类型的变量
    private RoleStateMemento roleStateMemento;


    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        roleStateMemento.setAtk(50);
        roleStateMemento.setDef(50);
        roleStateMemento.setVit(50);
        this.roleStateMemento = roleStateMemento;
    }
}
