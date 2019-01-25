
package fanis.koustoulas.app.estia;

import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DBController {
    private String db;
    
    
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement pst = null;
    private ResultSet resultSet = null;
    
    
    
    DBController(String db, String password){
        this.db = db;
        setDriver();
        setConnection();
    }
    
    private void setDriver(){
        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {

            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }
    }
    
    private void setConnection(){
        try {
            String filePath = new File("").getAbsolutePath() + "/";
            String msAccDB = filePath + db + ".accdb";
            String dbURL = "jdbc:ucanaccess://" + msAccDB; 
            System.out.println("ALL GOOD!");
            // Step 2.A: Create and get connection using DriverManager class
            connection = DriverManager.getConnection(dbURL); 

            
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        
    }
    
    public ResultSet query(String query){
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            return resultSet;
        
        }catch(SQLException e){
            System.out.println("error on query:  " + e.getSQLState() + "\n" + e.getMessage());
            return null;
        }
        
        
    }
    public boolean insert(String query){
        try {
            
            pst = connection.prepareStatement(query);
            return pst.execute();
            
        } catch (SQLException ex) {
            
            System.out.println("error on query:  " + ex.getSQLState() + "\n" + ex.getMessage());
            
            return false;
        }
        
    }
    public boolean login(String query){
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                
                return true;
            }else return false;
        
        }catch(Exception e){
            System.out.println("error on statement: " + e.getMessage());
            return false;
        }
        
    }
    
}
