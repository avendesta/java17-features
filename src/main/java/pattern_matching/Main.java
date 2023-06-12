package pattern_matching;

import pattern_matching.cats.Feline;
import pattern_matching.cats.Puma;
import pattern_matching.cats.Tiger;

public class Main {
    public static void main(String[] args) {

    }

    public static String makeSound(Feline feline){
        if(feline instanceof Tiger tiger){
            System.out.println(tiger.makeSound());
        }
        if(feline instanceof Puma puma){
            System.out.println(puma.makeSound());
        }
        return "";      // sealed interfaces will avoid this, so you don't have to struggle with testing.
    }
}
