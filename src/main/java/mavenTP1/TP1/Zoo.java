package mavenTP1.TP1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public int visiteur;
    public List<Secteur> secteurAnimaux= new ArrayList<Secteur>();

    int nbvisiteurMaxParSecteur=15;



    public Zoo(int visiteur, int nbvisiteurMaxParSecteur) {
        this.visiteur=visiteur;
        this.nbvisiteurMaxParSecteur=nbvisiteurMaxParSecteur;
    }

    public void AjouterSecteur (TypeAnimal typeAnimal ){

      secteurAnimaux.add(new Secteur(typeAnimal));
    }
    public void nouveauVisiteur() throws LimiteVisiteurException{
        if((this.visiteur+1)==getLimiteVisiteur()){

            throw new LimiteVisiteurException("dépasser les limite");
        }
      this.visiteur++;
    }
    public int getLimiteVisiteur(){
        return nbvisiteurMaxParSecteur * secteurAnimaux.size();
    }
    public void nouvelAnimal (Animal animal) throws AnimalDansMauvaisSecteurException{
        for(Secteur secteur:secteurAnimaux){
            if(secteur.typeAnimauxDansSecteur.equals((animal.getTypeAnimal()))){
                secteur.ajouterAnimal(animal);
            }
        }
    }
    public int nombreAnimaux(){
        int nombreAnimaux=0;
        for (Secteur secteur:secteurAnimaux) {
            nombreAnimaux +=secteur.getNombreAnimaux();
        }
        return nombreAnimaux();
    }
    //Bonus
   /* public List<Secteur> getSecteurAnimaux(){
        return this.secteurAnimaux;
    }
    public Secteur getSecteurFormType (TypeAnimal typeAnimal){
        return  secteurAnimaux.stream().filter(secteur -> secteur.obtenirType().equals(typeAnimal)).findFirst().orElse(null);
    }*/
}
