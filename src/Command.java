public class Command {
    private final String name;
    private final String description;
    private final CommandExecutor executor;

    public Command(String name, String description, CommandExecutor executor){
        this.name = name;
        this.description = description;
        this.executor = executor;
    }

    public void execute(){
        executor.execute();
    }

    interface CommandExecutor {
        void execute();
    }
}
