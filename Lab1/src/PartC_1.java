package Lab1;
/**
 * Creating a class that would accept a word as input and provide the length of the word
 */
public class InputWord {
    String word;
    public InputWord(String word){
        this.word = word;
    }
    //A method to get the word provided by user
    public String getWord(){
        return this.word;
    }
    public static void main(String[] args) {
        InputWord input = new InputWord("IntermediateComputerProgramming"); //Creating an object of the class
        String theWord = input.getWord(); //Getting the word provided
        int strLength = theWord.length(); //Calculating the length of the string
        System.out.println("Length of input String is "+strLength); //Printing result to user
    }
}
