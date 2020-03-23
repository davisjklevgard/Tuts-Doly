package projectsolutions;

/*
This Program is to help find the first unique letter in a string.
 */
public class FirstUniqueLetter{
    private static int TOTAL_CHARACTERS = 256;

    public static void main(String[] args) {

        System.out.println(finding("aardvark"));
        System.out.println("Hello");
    }

    private static int[] trackerOfCountsOfCharacters = new int [TOTAL_CHARACTERS];

    public static char finding(String string){
        char answer = 'a';
        //System.out.println(answer);
        for (int i = 0; i < string.length(); i++){
            //System.out.println("a");
            funWithASCIIandCHAR(string.charAt(i));
            //System.out.println(funWithASCIIandCHAR(string.charAt(i)));
        }

       // for (int i = 0; i < trackerOfCountsOfCharacters.length; i++) {
       //     System.out.println(trackerOfCountsOfCharacters[i]);
       // }
        for (int i = 0; i < TOTAL_CHARACTERS; i++){
            //System.out.println("a");
            if(trackerOfCountsOfCharacters[i] == 1) {
                //System.out.println("a");
                char curranswer = (char) i;
                System.out.println(curranswer);
                if (string.indexOf(curranswer) < string.length()) {
                    answer = curranswer;
                    System.out.println(answer);

                }
                System.out.println("a");
                if (answer == 1){

                    return answer;

                }
            }
        }
        
        return answer;
    }

    public static void funWithASCIIandCHAR(char letter) {
        System.out.println(letter);
        trackerOfCountsOfCharacters[letter]= trackerOfCountsOfCharacters[letter]++;
        //System.out.println("a");
    }
}