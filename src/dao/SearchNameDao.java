package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SearchNameDao {
    
    private PreparedStatement prepare;
    
    public void search(String name) throws SQLException {
        String query="select * from studentInfo \n" +
            "where name like '%"+name+"%' and name is not null";
        prepare=DbConnection.driver.prepareStatement(query);
       // prepare.setString(1, name);
        ResultSet result=prepare.executeQuery();
        
        if(result.next()==false){System.out.println("\t no match"); return;}

        do {            
            System.out.println(result.getInt("id")+"  " +result.getString("name"));
        } while (result.next()!=false);    
    }
}
