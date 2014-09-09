package unit10_arrays_practise;

import java.util.Scanner;

/**
 *
 * @author steew7981
 */
public class pallendrome {
    
    public static void main(String[] args) {
       String word;
        
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a word to see if it is a Palendrome: ");
       word = input.next ();
       input.close();
       
       char [] pall;
       pall = word.toCharArray();
       
       char [] pallOpp = new char [pall.length];
       
       for (int i = 0; i < pall.length; i ++){
           pallOpp[i] = pall [pall.length - 1 - i];
       }
       
//       for (int i = 0; i < pall.length; i ++){
//           System.out.print(pallOpp [i]);
//       }
       
       boolean isPal;
       isPal = true;
               
       
       for (int i = 0; i < pall.length; i ++){
           if (pall[i] != pallOpp [i] ){
               isPal = false;
//               System.out.println(isPal);
           }
       }
       
       if (isPal == true){
           System.out.print("The word " + word + " is a palindrome");
       }else {
           System.out.print("The word " + word + " is not a palindrome");
       }
       
    }
}
