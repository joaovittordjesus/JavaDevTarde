package RevisãoFPOO.Cadastro;

public class Dog extends Animals {

    String race;

    //CONSTRUCTOR
    public Dog(String race){

        this.race = race;

    }

    //GETTERS & SETTERS
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
