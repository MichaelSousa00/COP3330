public class Discussion2 {
    public static void main(String[] args) {
        //creating new phone objects
        Phone myPhone = new Phone(); 
        Phone mySamsung = new Samsung();  
        Phone myApple = new Apple();
        
        //accessing each method with dot operator  
        myPhone.OperatingSystem();    
        mySamsung.OperatingSystem();
        myApple.OperatingSystem();
    }
  }
  //parent class
  class Phone {
    public void OperatingSystem() {
        System.out.println("I usually run 32 or 64 bit architecture");
    }
  }
    //child class1
    class Samsung extends Phone {
        public void OperatingSystem() { 
            int bits = 32;
            System.out.println("The Andriod runs on "+bits+" bits");
    }
  }
    //child class2
    class Apple extends Phone {
        public void OperatingSystem() {
            int bits = 64;
            System.out.println("The iPhone runs on "+bits+" bits");
    }
  }
