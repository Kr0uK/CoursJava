package exo;

import java.util.Comparator;

/**
 * Created by user on 10/10/2016.
 */
public class CouleurCompare implements Comparator<Principal.ListeCouleurs> {


    @Override
    public int compare(Principal.ListeCouleurs o1, Principal.ListeCouleurs o2) {
        if (o1.getCouleur() != o2.getCouleur())
         return o1.getCouleur().compareTo(o2.getCouleur());
        else
        return o1.getNuance().compareTo(o2.getNuance());


    }

// Résultat : bleu clair, noir, blanc,  gris foncé, bleu foncé
}
