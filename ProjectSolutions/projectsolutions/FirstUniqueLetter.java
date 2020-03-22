package projectsolutions;

/*
This Program is to help find the first unique letter in a string.
 */
public class FirstUniqueLetter{
    private static int TOTAL_CHARACTERS = 256;

    public static void main(String[] args) {
        finding("Whole");
    }

    private static int[] trackerOfCountsOfCharacters = new int [TOTAL_CHARACTERS];

    public static char finding(String string){
        char answer = 0;
        for (int i = 0; i < string.length(); i++){
            funWithASCIIandCHAR(string.charAt(i));
        }
        for (int i = 0; i < TOTAL_CHARACTERS; i++){
            if(trackerOfCountsOfCharacters[i] == 1) {
                char curranswer = (char) i;
                if (string.indexOf(curranswer) < string.length()) {
                    answer = curranswer;

                }
                if (answer == 1){
                    return answer;
                }
            }
        }
        
        return answer;
    }

    public static void funWithASCIIandCHAR(char letter) {
        trackerOfCountsOfCharacters[letter]= trackerOfCountsOfCharacters[letter]++;
    }
}