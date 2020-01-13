/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.week2;
import java.util.Scanner;

/**
 *
 * @author emilydiano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] s = new Student[5];
        
        Scanner keysIn = new Scanner (System.in);
        
        for(int i=0; i<s.length; i++) {
            
            s[i] = new Student();
            
            System.out.println("Enter id: ");
            s[i].setId(keysIn.nextInt());
            
            System.out.println("Enter name: ");
            s[i].setName(keysIn.next());
        }
        
        System.out.println("Testing my repository.");
    }
    
}
