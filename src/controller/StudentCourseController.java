package controller;

import java.util.Scanner;
import model.StudentModel;
import service.StudentCourseImp;

public class StudentCourseController {
    
    private final Scanner input = new Scanner(System.in);
    private StudentCourseImp sci = new StudentCourseImp();
     
    public  void start(int id ) throws Exception{
        switch(choose()){
            case 1 : add(id); break;
            case 2 : delete(id); break;
        }
    } 
    
    private int choose(){
        System.out.println("\t add course    -> 1");
        System.out.println("\t delete course -> 2");
        return input.nextInt();
    }
    
    private void add(int id ){
        System.out.print("enter name object : ");
        String s=new Scanner(System.in).nextLine();
        StudentModel sm = new StudentModel(id, s);
        if ( sci.addCourse(sm)) System.out.println("insert done");
        else System.out.println("already exist");    
    }
    
    private void delete(int id ) throws Exception{
        System.out.print("enter name object : ");
        String s=new Scanner(System.in).nextLine();
        StudentModel sm = new StudentModel(id, s);
        sci.deleteCorse(sm);
    }
    
}
