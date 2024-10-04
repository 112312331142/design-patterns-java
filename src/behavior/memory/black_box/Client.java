package behavior.memory.black_box;

public class Client {
    public static void main(String[] args) {
        System.out.println("-----------------大战boss前--------------");
        //创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();//初始状态操作
        gameRole.stateDisplay();

        //将该游戏角色内部状态进行备份
        //创建管理者对象
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(gameRole.saveState());


        System.out.println("-----------------大战boss后--------------");
        //损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("-----------------使用回复药剂--------------");
        gameRole.recoverState(caretaker.getMemento());
        gameRole.stateDisplay();
    }
}
