package exo;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public enum ListeCouleurs {
        BLEUFONCE(1, "Bleu", "foncé","20447D"),
        NOIR(2,"Noir", "Noir","000000"),
        BLANC(3, "Blanc", "Blanc","FFFFFF"),
        GRISFONCE(4, "Gris", "foncé","555555"),
        BLEUCLAIR(5, "Bleu", "clair","00FFFF"),
        BLEU(6, "Bleu", "Bleu","0000FF");

        public int getId() {
            return id;
        }

        public String getCouleur() {
            return couleur;
        }

        public String getNuance() {
            return nuance;
        }

        public String getHexcode() {
            return hexcode;
        }

        ListeCouleurs(int id, String couleur, String nuance, String hexcode) {
            this.id = id;
            this.couleur = couleur;
            this.nuance = nuance;
            this.hexcode = hexcode;
        }

        int id;
        String couleur;
        String nuance;
        String hexcode;
    }

    public static void main(String[] args)
    {

       List<ListeCouleurs> ListCouleurs = new ArrayList<>();
        Collections.addAll(ListCouleurs, ListeCouleurs.values());


        CouleurCompare comp = new CouleurCompare();
        Collections.sort(ListCouleurs,comp);


        // Résultat : bleu clair, noir, blanc,  gris foncé, bleu foncé
        System.out.println(ListCouleurs);







    }
}
