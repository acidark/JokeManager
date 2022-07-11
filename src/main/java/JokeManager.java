import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    public String drawJoke(){
        if(this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        //isEmpty();
        Random random = new Random();
        int index = random.nextInt(this.jokes.size());
        return this.jokes.get(index);
    }
    public void printJokes(){
        //if (this.jokes.isEmpty()){
        //    System.out.println("Jokes are in short supply");
        //}
        isEmpty();
        int i = 0;
        while (i < this.jokes.size()){
            System.out.println(this.jokes.get(i));
            i++;
        }
    }
    public void isEmpty(){
        if(this.jokes.size()<1){
            System.out.println("Jokes are in short supply.");
        }
    }
}
