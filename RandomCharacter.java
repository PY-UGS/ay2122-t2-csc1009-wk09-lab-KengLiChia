package csc1009.src.lect09;

import java.util.Random;

public class RandomCharacter {

    Random rnd = new Random();

    public char getRandomLowerCaseLetter(){
        //get one random lower case character between 'a' and 'z'.
        char c = (char)('a'+ rnd.nextInt(26));
        return c;
    }

    public char getRandomUpperCaseLetter(){
        //get one random upper case character between 'A' and 'Z'.
        char c = (char)('A' +rnd.nextInt(26));
        return c;
    }


    public char getRandomDigitCharacter(){
        //get 0 to 9;
        int n = rnd.nextInt(10);
        char c = Character.forDigit(n, 10);
        return c;
    }

    public char getRandomCharacter(){ 
        //get one random character
        int choice = rnd.nextInt(3);
        
        if(choice == 0){

            return getRandomLowerCaseLetter();
        }

        else if(choice == 1){
             
            return getRandomUpperCaseLetter();
        }

        else if(choice == 2){
            return (char) getRandomDigitCharacter();
        }
        else {
            return '0';
        }
    }

    //Main program
    public static void main(String[] args) {
        RandomCharacter random = new RandomCharacter();

        System.out.println("Generated Random Lowercase Letters: ");
        for(int j = 0; j<15; j++){
            System.out.print(random.getRandomLowerCaseLetter());
    
        }

        System.out.println("");
        System.out.println("Generated Random Uppercase Letters: ");
        for(int j = 0; j<15; j++){
            System.out.print(random.getRandomUpperCaseLetter());
        }

        System.out.println("");
        System.out.println("Generated Random Digit Characters: ");
        for(int j = 0; j<15; j++){
            System.out.print(random.getRandomDigitCharacter());
        }

        System.out.println("");
        System.out.println("Generated Random Characters: ");
        for(int j = 0; j<15; j++){
            System.out.print(random.getRandomCharacter());
        }
    }
}

