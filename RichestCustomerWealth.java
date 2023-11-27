public class RichestCustomerWealth {
    public static void main(String args[]){
        int [][] accounts = {{1,2,3},{3,2,1}};
        int highWealth = maximumWealth( accounts);
            System.out.println("The person with richest wealth is: "+highWealth);
    }

    private static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i = 0; i < accounts.length; i++){
            int tempWealth = 0;
            for(int j = 0; j < accounts[0].length; j++){
                tempWealth += accounts[i][j];
            }
            if(maxWealth < tempWealth){
                maxWealth = tempWealth;
            }
        }
        return maxWealth;
    }
}
