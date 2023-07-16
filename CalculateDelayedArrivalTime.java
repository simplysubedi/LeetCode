public class CalculateDelayedArrivalTime {
    public static void main(String[] args){
        int arrivalTime = 15;
        int delayedTime = 5;
        System.out.println("The new arival time is: "+findDelayedArrivalTime(arrivalTime, delayedTime));
    }

    private static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int newArrivalTime = 0;
        int totaTime = arrivalTime + delayedTime;
        if(totaTime >= 24){
            newArrivalTime = totaTime - 24;
        }
        else newArrivalTime = totaTime;
        return newArrivalTime;
    }
}
