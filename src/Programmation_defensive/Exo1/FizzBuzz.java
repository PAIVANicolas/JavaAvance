package Programmation_defensive.Exo1;

public class FizzBuzz {
    public static String fizzBuzz(int i) {
        String res = "";
        res = Integer.toString(i);
        if(i == 0){
           res = "0";
        }
        else if(i % 3 == 0 && i % 5 == 0)
        {
            res = "Programmation_defensive.Collections.Collections.Exo1.FizzBuzz";
        }
        else if(i % 3 == 0)
        {
            res = "Fizz";
        }
        else if(i % 5 == 0)
        {
            res = "Buzz";
        }
        return res;
    }
}
