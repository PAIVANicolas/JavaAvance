package Listes.Exo2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class main {


    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(4);
        tab.add(5);

        System.out.println("Aﬀichage  dans  l’ordre  naturel");
        System.out.println("S1 : " +tab+"\n");

        for(int i = 0; i < tab.size(); i++){
            System.out.println("S2 : " +tab.get(i));
        }

        System.out.println("\n");

        for (Integer x : tab){
            System.out.println("S3 : " + x);
        }

        System.out.println("\n");

        Iterator<Integer> iter = tab.iterator();
        System.out.println("S4 : ");
        while (iter.hasNext()){
            System.out.print(iter.next()+ ", ");
        }

        System.out.println("\n");
        System.out.println("Aﬀichage  dans  l’ordre  inverse");
        System.out.println("\n");

        for(int i = tab.size()-1; i >= 0; i--){
            System.out.println(tab.get(i));
        }

        System.out.println("\n");

        Collections.reverse(tab);
        Iterator<Integer> iterInverse = tab.iterator();
        while (iterInverse.hasNext()){
            System.out.print(iterInverse.next() + ", ");
        }

        System.out.println("\n");
        System.out.println("Aﬀichage  des  éléments  de  rang  pair  (0,  2,  4…)  ");

    }
}