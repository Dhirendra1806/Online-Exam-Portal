import java.sql.*;
public class UserSave {
    Connection c;
    ResultSet rs;
    PreparedStatement ps;
    UserSave(String str, String str1, String str2, String str3, String str4, String str5) {
        /*System.out.print("Hello");*/
        try{
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
        	String strq="Insert into usertable (Name,Email,Password,Gender,City,Country) values (?,?,?,?,?,?)";
            ps=c.prepareStatement(strq);
            ps.setString(1, str);
            ps.setString(2, str1);
            ps.setString(3, str2);
            ps.setString(4, str3);
            ps.setString(5, str4);
            ps.setString(6, str5);
            int g=ps.executeUpdate();
            System.out.print(g);
        }catch( Exception e){
            System.out.print(e.getMessage());
        }
    }
}
