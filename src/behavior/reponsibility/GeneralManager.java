package behavior.reponsibility;

//总经理类（具体的处理者）
public class GeneralManager extends Handler{
    public GeneralManager() {
        super(NUM_THREE,NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+
                "天，请假内容："+leaveRequest.getContent());
        System.out.println("总经理审批");
        if(leaveRequest.getNum()<NUM_SEVEN){
            System.out.println("同意");
        }else{
            System.out.println("请假失败");
        }
    }
}
