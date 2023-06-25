public class ZigzagConversion {
    public static void main(String [] args){
        String s = "PAYPALISHIRING";
        int numOfRows = 2;
        System.out.println("The converted stribg is: "+convert(s, numOfRows));
    }

    private static String convert(String s, int numOfRows) {
        String result = "";
        int index = 0;
        int i = 0;
        char[][] charArray = new char[numOfRows][s.length()];
        while(s.charAt(index) != '\0')
        {
            while(i < numOfRows){
                for(int j = 0; j < s.length(); j++){
                    charArray[i][j] = s.charAt(i);
                    if(i == numOfRows - 1) {
                        i--;
                        break;
                    }
                    i++;
                }
            }

        }
        for(int k = 0; k < numOfRows; k++ ){
            for(int l = 0; l < numOfRows; l++ ){
                result += charArray[k][l];
            }
        }
        return result;
    }
}
