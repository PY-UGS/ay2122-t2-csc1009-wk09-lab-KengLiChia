package csc1009.src.lect09;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
public class TestCharacter {
    
    static RandomCharacter rand;

    @Before //setting up the start where we generate random character. 
    public void setup(){
        rand = new RandomCharacter();
    }

    @Test //test random lower case letter. 
    public void getRandomLowerCaseLetter(){
        char test = rand.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(test));
    }

    @Test //test for random uper case letter
    public void getRandomUpperCaseLetter(){
        char test = rand.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(test));
    }

    @Test //test for random digit character.
    public void getRandomDigitCharacter(){
        char test = rand.getRandomDigitCharacter();
        assertTrue(Character.isDigit(test));
    }

    @Test //test for random character
    public void getRandomCharacter(){
        char test = rand.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(test));
    }

    @Test
    public void getPrime(){
        
         int test = (int) rand.getRandomDigitCharacter() -'0';
         boolean isItPrime = true;
         System.out.println("Generated prime numbers: " + test );
 
         if (test <= 1) {
            isItPrime = false;
        } 

        else {
            for (int i = 2; i <= test/2; i++) {
                if (test % i == 0){
                    isItPrime = false;
                    break;
                }
            }
        }
        
         assertTrue(isItPrime);
        }
}
