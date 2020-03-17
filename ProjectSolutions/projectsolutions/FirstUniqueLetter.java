package projectsolutions;

/*
This Program is to help find the first unique letter in a string.
 */
public class FirstUniqueLetter{
    private static int TOTAL_CHARACTERS = 256;

    private int[] trackerOfCountsOfCharacters = new int [TOTAL_CHARACTERS];

    public char finding(String string){
        char answer = (char) string.length();
        for (int i = 0; i <= string.length(); i++){
            funWithASCIIandCHAR(string.charAt(i));
        }
        for (int i = 0; i <= TOTAL_CHARACTERS; i++){
            if(trackerOfCountsOfCharacters[i] == 1) {
                char curranswer = (char) i;
                if (string.indexOf(curranswer) < string.indexOf(answer)) {
                    answer = curranswer;
                }
            }
        }
        return answer;
    }

    public void funWithASCIIandCHAR(char letter) {
        trackerOfCountsOfCharacters[letter]= trackerOfCountsOfCharacters[letter]++;
    }
}