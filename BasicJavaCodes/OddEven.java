import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd");
        }
    }   
}
