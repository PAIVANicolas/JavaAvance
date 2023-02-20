package Généralités.Exo2;

public class main {
    public static void main(String[] args) {
        int i = 1;
        for (Integer x : new Fibonacci(20)){
            System.out.println("F"+i + " : " + x);
            i++;
        }
    }
}
