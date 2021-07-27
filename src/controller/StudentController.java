package controller;

import dao.StudentCourseDao;
import java.sql.SQLException;
import java.util.Scanner;
import model.StudentModel;
import service.StudentServiceImp;

public class StudentController {
    
    private StudentModel sm ;
    private final Scanner input = new Scanner(System.in);
    private final StudentServiceImp ss;

    public StudentController() {
        ss=new StudentServiceImp();
        sm=new StudentModel();
    }
    
    public void start() throws SQLException, Exception{
        while (true) {
            System.out.println("\t\t\t Insert -> 1");
            System.out.println("\t\t\t Login  -> 2");
            switch(input.nextInt()){
                case 1: addData(); ss.insert(sm); break;
                case 2:{
                    sm=(StudentModel)ss.login(this.getId());
                    if(sm==null)System.out.println("not found");
                    else{ print(sm); StudentCourseDao.search(sm.getId());
                    new StudentCourseController().start(sm.getId());
                    }
                }
                default: return;
            }
        }
    }
    
    private void addData(){
        System.out.print("enter id of student   : ");
        sm.setId(input.nextInt());
        System.out.print("enter name of student : ");
        sm.setName(new Scanner(System.in).nextLine());
    }
    
    private int getId(){
        System.out.print("Enter id : ");
        return input.nextInt();
    }
    
    private void print(StudentModel stm){
        System.out.printf("%30s ** id : %d\n\n" , "name : "+stm.getName(),stm.getId());
    }
    
}
