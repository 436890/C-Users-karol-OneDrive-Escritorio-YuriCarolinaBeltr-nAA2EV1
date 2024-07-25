/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1ev1;

/**
 *
 * @author karol
 */
import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
public class Proyecto1EV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario="root";
        String password="CarolinaJ.2";
        String url="jdbc:mysql://localhost:3306/inventarios ";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Proyecto1EV1.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        try {
            conexion=DriverManager.getConnection(url, usuario, password);
            statement=conexion.createStatement();
            rs=statement.executeQuery("select *from VENDEDOR");
            rs.next();
            do{
                System.out.println(rs.getInt("id_vendedor")+":"+rs.getString("identificación"));
                
               }while (rs.next());
            
            statement.executeUpdate ("INSERT INTO VENDEDOR VALUES ( 3521,'5547','Carolina_Beltran','carrera3','Bogota','243659','Caro.@gmail.com')");
             System.out.println("");
            rs=statement.executeQuery("select * from VENDEDOR");
            rs.next();
            do{
                System.out.println(rs.getInt("id_vendedor")+":"+rs.getString("identificación"));
                
               }while (rs.next());
            
            statement.executeUpdate ("UPDATE vendedor SET nombres='Santiago_Gomez' WHERE  id_vendedor=4326");
             System.out.println("");
            rs=statement.executeQuery("select * from VENDEDOR");
            rs.next();
            do{
                System.out.println(rs.getInt("id_vendedor")+":"+rs.getString("identificación"));
                
               }while (rs.next());
             
            statement.executeUpdate ("DELETE from vendedor WHERE id_vendedor=3521");
            System.out.println("");
            rs=statement.executeQuery("select * from VENDEDOR");
            rs.next();
            do{
                System.out.println(rs.getInt("id_vendedor")+":"+rs.getString("identificación"));
                
               }while (rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto1EV1.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
                    
    
    }
    
    
}