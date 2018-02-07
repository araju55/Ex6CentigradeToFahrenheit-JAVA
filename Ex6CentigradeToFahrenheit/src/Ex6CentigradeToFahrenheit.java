/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 17011947
 */
public class Ex6CentigradeToFahrenheit {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
    int celsius = kb.nextInt();
                
    int temperature = celsius * 9/5 + 32;
    System.out.println(temperature);
       
          
                
    }
    
}
