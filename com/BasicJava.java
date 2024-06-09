import java.util.*;
public class BasicJava{
    public static void main(String[] args) {
//      we use Scanner Class here to take input from java util package
        Scanner sc = new Scanner(System.in);
//      Here sc is the object created for scanner class
        System.out.println("Please enter 1st number");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter 2nd number");
        int x = sc.nextInt();
//      here we give Additional newline to make input clearer
        sc.nextLine();
        int y = n+x;
        System.out.println("Outpur is "+ y);
//      here we give Additional newline to make input clearer
        System.out.println();
// Now to take input of whole line 
        System.out.println("Please enter the sentence");
        String Line=sc.nextLine();
        System.out.println(Line);
    }
}