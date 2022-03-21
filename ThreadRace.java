//Michael Sousa

class Animal implements Runnable{
    public String name;
    public int speed; //how fast each animal runs
    public int maxrest; //how long the animal rests between each run 
    public int position; //animal's position in race
    public boolean winner = false;
    public Food food;   

    //constructor for animal class to use in run() and other classes
    Animal(String name, int position, int speed, int maxrest, boolean winner, Food food){
        this.name = name;
        this.position = position;
        this.speed = speed;
        this.maxrest = maxrest;
        this.winner = winner;
        this.food = food;
    }

    //this method is used to determine the specifics of the race
    @Override //override used for run method since we implement runnable 
    public void run(){
        for (position = 0; position <= 120; position++) {
            
            //stops program once winner is found
            if(position == 120){
                winner = true; 
                System.out.println(winner+" Winner is: "+name);
                System.exit(1);
            }
            
            food.eat(name); //makes an animal eat at random
            System.out.println( name+"'s Position = " +position); 
            position += speed; 
            
            try {
                Thread.sleep((long)(Math.random() * maxrest)); //(random num * maxrest) 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }//run
}//animal
 
class Food{
    public void eat(String name){ 
        System.out.println(name+" is eating...");
    }
}//food

//race class and each object
public class ThreadRace{
    public static void main(String[] args) {
        Food food = new Food();

        Animal hare = new Animal("Splinter", 0, 9, 220, false, food);
        Thread hareThread = new Thread(hare); 
        hareThread.start();
    
        Animal tortoise = new Animal("Mikey", 0, 5, 165, false, food);
        Thread tortThread = new Thread(tortoise); 
        tortThread.start();
    }//main
}//race
