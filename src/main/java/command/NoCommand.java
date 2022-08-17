package command;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("아무 명령도 실행되지 않았습니다.");
    }

    @Override
    public void undo() {
        System.out.println("아무 명령도 실행되지 않았습니다.");
    }
}
