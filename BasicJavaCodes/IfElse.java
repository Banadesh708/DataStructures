import java.util.*;
public class IfElse {
    public static void main(String[] args){
        System.out.println("Enter the Height in Feet");
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        if(height<5.5){
            System.out.println("Not eligible for military");
        }
        else if(height>5.5 && height < 5.8){
            System.out.println("Depends on other factor");
        }
        else{
            System.out.println("Eligible");
        }
    }
}
