public class FindIndexOfFirstOccurrence {
    public static void main(String [] args){
        String haystack = "sadbutsad";
        String  needle = "sad";
        System.out.println("The index is : "+strGiveIndexStr(haystack, needle));
    }

    private static int strGiveIndexStr(String haystack, String needle) {
        int flag = -1;
        int sizeOfNeedle = needle.length();
        if(haystack.length() < sizeOfNeedle){
            return flag;
        }
        if(haystack.equals(needle)){
            return 0;
        }
        for(int i =  0; i < haystack.length() && i < haystack.length() +1 - sizeOfNeedle; i++){
            if(haystack.charAt(i) == (needle.charAt(0))){
                if(haystack.substring(i ,i+sizeOfNeedle).equals(needle)){
                    flag = i;
                    break;
                }
            }
        }
        return flag;
    }
}
