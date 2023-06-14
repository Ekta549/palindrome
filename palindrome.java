public class palindrome {
        public static void main(String[] args) {
      
          String str = "Mom", revStr = "";
          
          int strLength = str.length();
      
          for (int i = (strLength - 1); i >=0; --i) {
            revStr = revStr + str.charAt(i);
          }
      
          if (str.toLowerCase().equals(revStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
          }
          else {
            System.out.println(str + " is not a Palindrome String.");
          }
        }
      
}
