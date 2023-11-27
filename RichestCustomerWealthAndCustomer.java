import java.util.ArrayList;
import java.util.List;

public class RichestCustomerWealthAndCustomer {
    public static void main(String args[]){
        int [][] accounts = {{1,2,3},{3,2,1}};
        System.out.println("The person with richest wealth is: "+ maximumWealth(accounts).get(0) + " and the customer is: "+maximumWealth(accounts).get(1));
    }

    private static List<Integer> maximumWealth(int[][] accounts) {
        List<Integer> maxList = new ArrayList<>();
        int maxWealth = 0;
        int richCustomer = 0;
        for(int i = 0; i < accounts.length; i++){
            int tempWealth = 0;
            for(int j = 0; j < accounts[0].length; j++){
                tempWealth += accounts[i][j];
            }
            if(maxWealth < tempWealth){
                maxWealth = tempWealth;
                richCustomer = i;
            }
        }
        maxList.add(maxWealth);
        maxList.add(richCustomer);
        return maxList;
    }

}
