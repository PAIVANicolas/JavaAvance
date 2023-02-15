package Exo2;

public class Ami {

    public static String bonjour(String nom) {
        String retNom = nom;
        String retBonjour = "Bonjour";

        if (nom == null) {
            retNom = "Ami";
        } else if(nom .equals(nom.toUpperCase())){
            retBonjour = retBonjour.toUpperCase();
            retNom = retNom.toUpperCase() ;
        }
        return retBonjour + ", " + retNom + ".";
    }
}
