public class DoWhile {
    public static void main(String[] args) {
        int i=0;
        int j=15;
       do{
            System.out.println(i);
            i++;
        }
        while(i<15);
        System.out.println("");

        // Here it just prints 15 only once as it does not satisfy the condition as j>15;
        do{
            System.out.println(j);
            j--;
        }
        while(j>15);
    }
}

