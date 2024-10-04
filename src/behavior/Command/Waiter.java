package behavior.Command;

import java.util.ArrayList;
import java.util.List;

//服务员类（属于请求者角色）
public class Waiter {

    //持有多个命令对象
    private final List<Command> commands=new ArrayList<>();


    public void setCommands(Command  cmd){
        //将cmd对象存储到list集合中
        commands.add(cmd);
    }

    //发起命令的方法 喊订单来了
    public void orderUp(){
        System.out.println("美女服务员：大厨，订单来了");
        //遍历command集合
        for(Command cmd:commands){
            if(cmd!=null){
                cmd.execute();
            }
        }
    }
}
