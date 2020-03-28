package projectsolutions;

/*
This Program is to help find the first unique letter in a string.
 */
public class FirstUniqueLetter{
    //creates a private integer that cannot be changed
    private static int TOTAL_CHARACTERS = 256;
    //creates a main method
    public static void main(String[] args) {
        // prints out what the method finding is returning
        System.out.println(finding("aardvark"));
        //prints the word Hello
        System.out.println("Hello");
    }
    //creates a private array that includes all the Total characters
    private static int[] trackerOfCountsOfCharacters = new int [TOTAL_CHARACTERS];
    // creates a public method that takes in a string as a parameter
    public static int finding(String string){
        String input = string;

        //System.out.println(input);
        //runs a for loop that counts each character and gives a number of how many times that character appears in the string for how long the string is
        for (int i = 0; i < input.length(); i++){
            //System.out.println("a");
            //puts the string through the funWithASCIIandCHAR method to put a count on each of the characters
            funWithASCIIandCHAR(input.charAt(i));
            System.out.println(funWithASCIIandCHAR(input.charAt(i)));
        }

        for (int i = 0; i < input.length(); i++){
            //System.out.println("a");
            if(trackerOfCountsOfCharacters[input.charAt(i)] == 1) {
               return input.charAt(i);

                }

            }
        return 0;
        }


    public static int funWithASCIIandCHAR(char letter) {
        trackerOfCountsOfCharacters[letter]++;
        return trackerOfCountsOfCharacters[letter];

    }


}