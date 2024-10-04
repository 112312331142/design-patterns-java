package behavior.reponsibility;

//小组长类（具体的处理者）
public class GroupLeader extends Handler{
    public GroupLeader() {
        super(0,NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+
                "天，请假内容："+leaveRequest.getContent());
        System.out.println("小组长审批");
        if(leaveRequest.getNum()<NUM_ONE){
            System.out.println("同意");
        }else{
            System.out.println("提交给经理");
        }
    }
}
