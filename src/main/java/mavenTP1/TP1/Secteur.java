package mavenTP1.TP1;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
    public TypeAnimal typeAnimauxDansSecteur;
    public List<Animal> animauxDansSecteur;
    public int nbrAnimaux=0;
      public Secteur (TypeAnimal typeSecteur){
          typeAnimauxDansSecteur=typeSecteur;
          animauxDansSecteur= new ArrayList<>();

      }
      public void  ajouterAnimal(Animal animal){
          animauxDansSecteur.add(animal);
          nbrAnimaux++;
      }
      public int getNombreAnimaux(){
          return nbrAnimaux;
      }
      public  TypeAnimal obtenirType(){
          return typeAnimauxDansSecteur;
      }

}
