
public class FizzBuzz {

    public static String fizzBuzz(int i) {
        String res = "";
        if(i % 3 == 0 && i % 5 == 0)
        {
            res = "FizzBuzz";
        }
        else if(i % 3 == 0)
        {
            res = "Fizz";
        }
        else if(i % 5 == 0)
        {
            res = "Buzz";
        }
        else
        {
            res = Integer.toString(i);
        }
        return res;
    }
}
