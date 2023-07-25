package RevisãoFPOO.Cadastro;

public class Animals {

    //Atributtes
    String size;
    //String not a primal variable((S)tring)
    double weight;
    //double primal variable((d)ouble)
    String owner;
    String gender;
    String specie;

    //BUILDERS
    public Animals(String size, double weight, String owner, String gender, String specie) {
        this.size = size;
        this.weight = weight;
        this.owner = owner;
        this.gender = gender;
        this.specie = specie;
    }

    public Animals() {

    }

    //GETTERS(GET INFORMATION) AND SETTER(SET INFORMATION)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
    
    
}


