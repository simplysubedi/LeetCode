public class TargetEmployeeHours {
    public static void main(String args[]){
        int [] hours = {0,1,2,3,4};
        int target = 2;
        System.out.println("The number of employee that meet the target hours is : "+numberOfEmployeesWhoMetTarget(hours,target));
    }

    private static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i < hours.length; i++){
            if(hours[i] >= target){
                count++;
            }
        }
        return count;
    }
}
