import java.util.Scanner;

public class palindrome {
        public static void main(String[] args) {
      
          String str, revStr = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
          int strLength = str.length();
      
          for (int i = (strLength - 1); i >=0; --i) {
            revStr = revStr + str.charAt(i);
          }
      
           if (str.equals(revStr))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
          }
        
