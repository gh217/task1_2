package service;

import model.StudentModel;

public interface StudentCourseInterface {
    
    public boolean addCourse(StudentModel sm);
    public void deleteCorse(StudentModel sm) throws Exception;
    public void search(int id) throws Exception;
    
}
