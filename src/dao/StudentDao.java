package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.StudentModel;

public class StudentDao {
    
    private PreparedStatement prepare;
     
    public boolean insert(StudentModel stm){
       try {
            String query ="insert into studentInfo(id,name) values(?,?)";
            prepare=DbConnection.driver.prepareStatement(query);
            prepare.setInt(1, stm.getId());
            prepare.setString(2, stm.getName());
            prepare.execute();
            System.out.println("\n\tinsert done\n");
            return  true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public Object login(int id) throws SQLException{
        String query="select * from studentInfo where id=?";
        prepare=DbConnection.driver.prepareStatement(query);
        prepare.setInt(1, id);
        ResultSet result=prepare.executeQuery();
        if(result.next()==false)return null;
        else{
            StudentModel st=new StudentModel() ;
            st.setId(result.getInt("id"));
            st.setName(result.getString("name"));
            return st;
        }
    }
}
