public class IntegerReplacement {
    public static void main(String[] args){
        int num = 8;
        System.out.println("The number of operation to become 1 is :"+integerReplacement(num) );
    }

    private static int integerReplacement(int num) {
        int count = 0;
        long temp = num;
        while(temp != 1){
           if(temp%2 == 0){
               temp = temp/2;
               count++;
           }
           else  {
               if(temp == 3){
                   count = count +2;
                   break;
               }
               long plus = temp+1;
               long minus = temp -1;
                if((plus/2)%2 == 0)
                    temp++;
                if((minus/2)%2 == 0)
                    temp--;

               count++;
           }

           if(temp == 1)
               break;
        }
        return count;

    }
}
