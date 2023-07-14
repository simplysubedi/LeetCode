public class NoOfSteps {
    public static void main(String [] args){
        int num = 14;
        System.out.println("The number of steps required to reduce it to zero is: "+numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        int count = 0;
        while(num != 0){
            if(num % 2 == 0){
                num = num/2;
                count++;
                System.out.println(count);
            }
            else{
                num = num - 1;
                count++;
                System.out.println(count);
            }
        }
        return count;
    }
}
