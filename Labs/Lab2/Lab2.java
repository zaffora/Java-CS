//found at https://beginnersbook.com/2014/01/java-program-to-check-palindrome-string-using-recursion/


import java.util.Scanner;
class PalindromeCheck
{
    
    public static boolean isPal(String word)
    {  
        if(word.length() == 0 || word.length() == 1)
            return true; 
        if(word.charAt(0) == word.charAt(word.length()-1)){
            return isPal(word.substring(1, word.length()-1));
        }      

        return false;
    }

    public static void main(String[]args)
    {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
      
        if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}