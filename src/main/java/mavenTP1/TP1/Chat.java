package mavenTP1.TP1;

public class Chat extends Chien {


    public Chat(String nomAnimal, TypeAnimal type) {
        super(nomAnimal, TypeAnimal.Chat);
    }

    @Override
    public String getNomAnimal(){
        return nomAnimal;
    }

}
