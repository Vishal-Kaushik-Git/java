class Earth{

    String livingbeings;
    String Elements;

    public void print(){
        System.out.println("Made by Gods");
    }

    public void BeingAndElement(){
        System.out.println(this.livingbeings);
        System.out.println(this.Elements);
    }
}

public class ClassesAndObjects{
    public static void main(String[] args) {
        Earth e1 = new Earth();
        Earth e2 = new Earth();

        e1.livingbeings = "Humans";
        e2.livingbeings = "Animals";

        e1.Elements = "Water";
        e2.Elements = "Air";

        e1.print();
        e1.BeingAndElement();
        e2.BeingAndElement();
    }
}