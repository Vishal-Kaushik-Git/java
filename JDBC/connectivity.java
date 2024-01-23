import java.sql.*;
public class connectivity {
    public static void main(String[] args) {
        try{
            Class.forName("com.cj.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/vishal";
            String user = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);

            if(con.isClosed()){
                System.out.println("Closed");
            }else{
                System.err.println("created");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
