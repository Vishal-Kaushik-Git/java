abstract class Species{
    abstract void intelligence();
}

class Humans extends Species{
       public void intelligence(){
        System.out.println("More intelligent ");
       }
}

class Animals extends Species{
    public void intelligence(){
      System.out.println("Less Intelligent ");
    }
}

public class Abstractions {
    public static void main(String[] args) {
      Humans hum = new Humans();
      hum.intelligence();
      
      // Species sep = new Species(); // cannot initiate this because of abstraction
      // sep.intelligence();
    }
}
