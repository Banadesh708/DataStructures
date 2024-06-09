public class Function {
    public static int CalculateSum(int x , int y){
        int z = x+y;
        return z;
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int result = CalculateSum(x, y);
        System.out.println(result);
    }
}
