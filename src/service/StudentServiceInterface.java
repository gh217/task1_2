package service;

import java.sql.SQLException;
import model.StudentModel;

public interface StudentServiceInterface {
    
    public boolean insert(StudentModel stm);
    
    public Object login( int id) throws SQLException;
    
}
