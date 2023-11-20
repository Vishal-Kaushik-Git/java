class Earth{
        String livingbeing ;
        String population;
        boolean dominate;

        //Rules for using Polymorhism aka Function overloading
        // ---------    follow any one this condition   -----------
        // Either return type different  - void int boolean etc...
        // or Datatype of each argument is deff
        // or Provie more than one argument in function
    
        public void Say(String livingbeing){
           System.out.println("LivingBeiing " +livingbeing);
        }

        public void Say(String livingbeing, String population){
            System.out.println(livingbeing + " with " + " Population of " +population);
        }

        public void Say(boolean dominate){
           System.out.println("Dominating " +dominate);
        }

    
    }
public class FunctionOverloading {

    public static void main(String[] args) {
        Earth e1 = new Earth();
        e1.livingbeing = "Humans";
        e1.population = "7 Billion";
        e1.dominate = true;

        e1.Say(e1.livingbeing, e1.population);
        e1.Say(e1.dominate);

    }
}

