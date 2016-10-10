package exo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public enum ListeCouleurs {
        BLEUFONCE(1, "Bleu", "foncé"),
        NOIR(2,"noir", ""),
        BLANC(3, "blanc", ""),
        GRISFONCE(4, "gris", "foncé"),
        BLEUCLAIR(5, "bleu", "clair"),
        BLEU(6, "bleu", "");

        public int getId() {
            return id;
        }

        public String getCouleur() {
            return couleur;
        }

        public String getNuance() {
            return nuance;
        }

        ListeCouleurs(int id, String couleur, String nuance) {
            this.id = id;
            this.couleur = couleur;
            this.nuance = nuance;
        }

        int id;
        String couleur;
        String nuance;
    }

    public static void main(String[] args)
    {

       List<ListeCouleurs> ListCouleurs = new ArrayList<>();

        for (ListeCouleurs couleur: ListeCouleurs.values()) {
            ListCouleurs.add(couleur);
           // System.out.println(couleur);
        }



    }
}
