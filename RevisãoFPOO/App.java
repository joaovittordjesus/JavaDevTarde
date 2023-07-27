package RevisãoFPOO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.print.attribute.standard.MediaSize.Other;
import javax.swing.JOptionPane;
import RevisãoFPOO.Cadastro.Animals;
import RevisãoFPOO.Cadastro.Cat;
import RevisãoFPOO.Cadastro.Dog;

public class App {
    public static void main(String[] args) {
        //SOTORE MY OBJECTS
        Cat cats[] = new Cat[10];
        Dog dogs[] = new Dog[10];
        Other others[] = new Other[10];
        //CONTADOR
        int countCats = 0;
        int countDogs = 0;
        int countOthers = 0;
        //SIGN-UP CREATION
        //System.out.println("Bem vindo ao Consultório do Dr. Frankstein");
        JOptionPane.showMessageDialog(null, "Wellcome to the Petshop");
        boolean open = true;
        if(java.time.LocalDateTime.now(zone:null)>8 && LocalDateTime.now(zone:null)<18){
            open=true;
        }

        else{
            open=false;
        }
        
        while (open){
            int action = Integer.parseInt(JOptionPane.showInputDialog("1-Sign-up pet/n 2-Apoint an exam/n 3-"));
            if(action == 1){
                int action2 = Integer.parseInt(JOptionPane.showInputDialog("1-Cat/n 2-Dog/n 3-Others"));
                if(action2 == 1){
                    //CATSIGNUP
                }
                else if(action2 == 2){
                    //DOGSIGNUP
                }
                else{
                    //OTHERS
                }
            }
        }

    }


}

//NEW EXERCISE:
/*Create the Apoitments Class and Store the Consults*/
 