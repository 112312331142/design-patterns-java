package behavior.reponsibility;

//副经理类（具体的处理者）
public class Manager extends Handler{
    public Manager() {
        super(NUM_ONE,NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+
                "天，请假内容："+leaveRequest.getContent());
        System.out.println("副经理审批");
        if(leaveRequest.getNum()<NUM_THREE){
            System.out.println("同意");
        }else{
            System.out.println("提交给总经理");
        }
    }
}
