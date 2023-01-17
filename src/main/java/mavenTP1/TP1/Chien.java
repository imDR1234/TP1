package mavenTP1.TP1;

public class Chien extends Animal{
    public Chien(String nomAnimal, TypeAnimal type) {
        super(nomAnimal,TypeAnimal.Chien);
    }

    @Override
    public String getNomAnimal(){
        return nomAnimal;
    }
}
