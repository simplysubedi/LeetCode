public class SquareRoot {
    public static void main (String [] args){
    int num=2147483647;
        System.out.println("The root is: "+ mySqrt(num));

    }
    public static int mySqrt(int x) {
        if(x <= 1){
            return x;
        }
        long temp = 1 ;
        while( temp <= x/2 ){
            if(temp * temp == x){
                return (int)temp;

            }
            if(temp * temp > x){
                break;

            }
            temp ++;
        }
        return (int)(temp-1);
    }
}
