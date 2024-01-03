import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Command> commands = createCommands();

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Pokedex > ");
            String line = input.nextLine();

            if (commands.containsKey(line)){
                Command command = commands.get(line);
                command.execute();
            }

        }
    }

    private static Map<String, Command> createCommands(){
        Map<String, Command> commands = new HashMap<>();

        commands.put("help", new Command("help", "Displays a help message", Main::commandHelp));
        commands.put("exit", new Command("exit", "Exit the Pokedex", Main::commandExit));

        return commands;
    }
    private static void commandHelp(){
        System.out.println(
                """
                
                Welcome to the Pokedex!
                Usage:
                
                help: Displays a help message
                exit: Exit the Pokedex
                """
        );
    }

    private static void commandExit(){
        System.exit(0);
    }
}