public class DetermineColorOfChessBoard {
    public static void main(String []args){
        String coordinates = "a1";
        if(squareIsWhite(coordinates))
            System.out.println("Color is white");
        else
            System.out.println("Color is black");
    }

    private static boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        int number = Integer.parseInt(coordinates.substring(1));
        int letterIndex = letter - 'a';
        return (letterIndex + number) % 2 == 0;
    }
}
