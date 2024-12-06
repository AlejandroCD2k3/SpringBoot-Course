package palindromeDefinition.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import palindromeDefinition.BusinessLogic.Palindrome;

@RestController
public class PalindromeController {

    Palindrome myPalindrome = new Palindrome();

    @GetMapping("palindrome/{word}")
    public String isPalindrome(@PathVariable String word) {
        if(myPalindrome.isPalindrome(word)){
            return "Your word is a palindrome";
        }
        else{
            return "Your word is not a palindrome";
        }
    }
}
