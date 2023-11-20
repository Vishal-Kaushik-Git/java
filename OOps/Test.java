class minitest{
    private String str = "vishal";

    public void setString(String name){
        this.str = name;
    }
    public String getString(){
        return this.str;
    }
}

public class Test {
    public static void main(String[] args) {
        minitest mt = new minitest();
        mt.setString("hero");
        System.out.println(mt.getString());
    }
}
