package service;

import dao.StudentCourseDao;
import model.StudentModel;


public class StudentCourseImp implements StudentCourseInterface{

    private StudentCourseDao scd=new StudentCourseDao();
    
    @Override
    public boolean addCourse(StudentModel sm) {
        return scd.addCourde(sm);
    }

    @Override
    public void deleteCorse(StudentModel sm) throws Exception{
        scd.deleteCourse(sm);
    }

    @Override
    public void search(int id) throws Exception{
        scd.search(id);
    }

    
}
