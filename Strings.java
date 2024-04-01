/**
*Student Name: Masike Rasenyalo
* Student Number: ST10452404
*/
package strings;


public class Strings {

   
    public static void main(String[] args) {
        
        String firstName ="Alfred ";
        String fullName ="Alfred Hetsworth ";
        char firstInitial = firstName.charAt(0);
        
        System.out.println("User's first initial: " + firstInitial);
        fullName = fullName.toUpperCase();
        
        System.out.println("Full name in uppercase: " + fullName);
        int fullNameLength = fullName.length();
        
        System.out.println("Length of full name : " + fullNameLength);
     
    }
    
}
