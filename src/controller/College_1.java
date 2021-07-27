
package controller;

import dao.DbConnection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class College_1 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws SQLException, Exception {
        
        try {
            DbConnection.connect();
            boolean flag=true;
            while(flag){
                int choose=start();
                switch(choose){
                    case 1 : new StudentController().start(); break;
                    case 2 :System.out.print("enter name : ");
                        String s=new Scanner(System.in).nextLine();
                        new SearchAllController().search(s); break;
                    default:flag=false;
                }
            }
        }catch (SQLException e) {
            
            System.err.println(Arrays.toString(e.getStackTrace()));
        }finally{
            DbConnection.driver.close();
        }
        
        
    }
    
    public static int start(){
        System.out.println("\t\t\t student -> 1");
        System.out.println("\t\t\t search  -> 2 ");
        return input.nextInt();
    }
}
