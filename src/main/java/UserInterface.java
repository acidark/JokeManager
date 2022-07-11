import java.util.Scanner;

public class UserInterface {
    private JokeManager jManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jManager,Scanner scanner){
        this.jManager = jManager;
        this.scanner = scanner;
    }
    public void start(){
        while(true){
            System.out.println("Commands");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            //processManager(command);
            if(command.equals("X")){
                break;
            }
            processManager(command);
        }
    }
    public void processManager(String input){
        if(input.equals("1")){
            addJoke();
        } else if (input.equals("2")){
            drawJoke();
        } else if (input.equals("3")){
            listJokes();
        } //else {//input.equals("X")){
         //   break;
        //} 
    }
    public void addJoke(){
        System.out.println("Add joke:");
        String joke = scanner.nextLine();
        jManager.addJoke(joke);
    }
    public void drawJoke(){
        System.out.println("Drawing jokes:");
        System.out.println(jManager.drawJoke());
    }
    public void listJokes(){
        System.out.println("Printing jokes:");
        jManager.printJokes();
    }
}
