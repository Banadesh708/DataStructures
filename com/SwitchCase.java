import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter the Button to be pressed which proceeds to give wishes");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Namaskara");
            break;
            default : System.out.println("Invalid Button");
        }
    }   
}
