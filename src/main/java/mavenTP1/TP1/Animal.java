package mavenTP1.TP1;

public class Animal  {

    public String nomAnimal;
    public TypeAnimal typeAnimal;
    public Animal(String nomAnimal,TypeAnimal type){
        this.nomAnimal=nomAnimal;
        this.typeAnimal=type;

    }
    public String getNomAnimal(){
        return nomAnimal;
    }
    public TypeAnimal getTypeAnimal(){
        return typeAnimal;
    }

}
