package palindromeDefinition.BusinessLogic;

public class Palindrome {

    public boolean isPalindrome(String word){

        String myWord = word.toLowerCase();
        int wordLenght = myWord.length();


        for(int i = 0; i < (wordLenght/2)+1; i++){
            if(myWord.charAt(i) != myWord.charAt(wordLenght-i-1)){
                return false;
            }
        }
        return true;
    }

}
