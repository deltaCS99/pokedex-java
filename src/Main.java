import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Pokedex > ");
            String line = input.nextLine();
            if(line.replaceAll("\\s", "").equalsIgnoreCase("exit")){
                break;
            }

            switch(line.toLowerCase()){
                case "help":
                    getHelpMenu();
                    break;
            }

        }
    }

    private static void getHelpMenu(){
        System.out.println(
                """
                
                Welcome to the Pokedex!
                Usage:
                
                help: Displays a help message
                exit: Exit the Pokedex
                """
        );
    }
}