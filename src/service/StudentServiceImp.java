package service;

import dao.StudentDao;
import java.sql.SQLException;
import model.StudentModel;

public class StudentServiceImp implements StudentServiceInterface{

    private final StudentDao sd;
   
    public StudentServiceImp() {
        this.sd = new StudentDao();
    }
    
    @Override
    public boolean insert(StudentModel stm) {
        return sd.insert(stm);
    }

    @Override
    public Object login(int id) throws SQLException{
        return  sd.login(id);
    }
    
}
