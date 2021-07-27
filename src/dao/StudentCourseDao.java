package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.StudentModel;

public class StudentCourseDao {
    private static PreparedStatement prepare;
     
    public void deleteCourse(StudentModel sm) throws SQLException{
        String query="delete from studentCourse where id=? and name=?";
        prepare=DbConnection.driver.prepareStatement(query);
        prepare.setInt(1, sm.getId());
        prepare.setString(2, sm.getName());
        prepare.execute();
    }
    
    public boolean addCourde(StudentModel sm){
        try {
            String query="insert into studentCourse(id,name) values(?,?)";
            prepare=DbConnection.driver.prepareStatement(query);
            prepare.setInt(1, sm.getId());
            prepare.setString(2, sm.getName());
            prepare.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static void search(int id) throws SQLException{
        String query="select * from studentCourse where id=?";
        prepare=DbConnection.driver.prepareStatement(query);
        prepare.setInt(1,id);
        ResultSet result=prepare.executeQuery();
        
        if(result.next()==false)System.out.println("\n\t no Course");
        else{
            System.out.print("\t ** ");
            do{                
                System.out.print(result.getString("name")+" ** ");
            } while (result.next()!=false);
            System.out.println("");
        }
    }
}
