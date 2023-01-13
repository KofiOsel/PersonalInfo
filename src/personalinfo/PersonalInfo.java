/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalinfo;

import java.util.Scanner;

/**
 *
 * @author Kofi Osel
 */
public class PersonalInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //input
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = scan.nextLine();
        System.out.print("Please enter your age:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Please enter your gender:");
        String gender = scan.nextLine();
        System.out.print("Please enter your Departement:");
        String depart = scan.nextLine();
        System.out.print("Please  enter the value of PI (3.1415926):");
        double pi = scan.nextDouble();
        
        //input
        System.out.printf("%-15s: %s\n","First Name",name);
        System.out.printf("%-15s: %s\n","Age",age);
        System.out.printf("%-15s: %s\n","Gender",gender);
        System.out.printf("%-15s: %s\n","Departement",depart);
        System.out.printf("%-15s: %.2f\n","PI",pi);
      
    }
    
}
