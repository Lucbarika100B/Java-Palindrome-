/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author lucanthony
 */

import java.util.Scanner;

public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        String pal = sc.nextLine();
        int startPos = 0;
        int endPos = pal.length() -1; 
        boolean isPal = true; 
        
        while(startPos < endPos)
        {
           String startLetter = pal.substring(startPos, startPos + 1);
           String endLetter = pal.substring(endPos, endPos+ 1);
           
           if(startLetter.equals(endLetter) == false)
            {
                isPal = false;
                break;
                
                
               }
           startPos ++;
           endPos --;
        
       
       
          }
        if(isPal == true)
         {
             System.out.println(pal + " is a palindrome");
          }
        else 
          {
              System.out.println(pal + "is not a palindrome");
          }
    }
    

}