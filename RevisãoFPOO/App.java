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
        Apointments apointments[] = new Apointments[255];
        //CONTADOR
        int countCats = 0;
        int countDogs = 0;
        int countOthers = 0;
        int countApointments = 0;
        
        //SIGN-UP CREATION
        //System.out.println("Bem vindo ao Consultório do Dr. Frankstein");
        JOptionPane.showMessageDialog(null, "Wellcome to the Petshop");
        boolean open = true;
        if(java.time.LocalDateTime.now().getHour() >= 8 && LocalDateTime.now().getHour() <=18){
            open=true;
        }

        else{
            open=false;
        }
        
        while (open){
            if(java.time.LocalDateTime.now().getHour() >= 8 && LocalDateTime.now().getHour() <=18){
                open=true;
            }
    
            else{
                open=false;
            }

            int action = Integer.parseInt(JOptionPane.showInputDialog(" 1-Sign-up a pet/n 2-Apoint an exam/n 3-Exit"));
            
            if(action == 1){
                int action2 = Integer.parseInt(JOptionPane.showInputDialog("1-Cat/n 2-Dog/n 3-Others"));
                if(action2 == 1){
                
                String race = JOptionPane.showInputDialog("Enter the cats race: ");
                String size = JOptionPane.showInputDialog("Enter the cat's size: ");
                double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the cat's weight: "));
                String owner = JOptionPane.showInputDialog("Enter the cat's owner name: ");
                String gender = JOptionPane.showInputDialog("Enter the cat's gender: ");
                String specie = JOptionPane.showInputDialog("Enter the cat's specie: ");
                
                cats[countCats] = new Cat(race);
                cats[countCats].setRace(race);
                cats[countCats].setSize(size);
                cats[countCats].setWeight(weight);
                cats[countCats].setOwner(owner);
                cats[countCats].setGender(gender);
                cats[countCats].setSpecie(specie);

                countCats++;
                JOptionPane.showMessageDialog(null, "Cat was registered successfully");

                }
                else if(action2 == 2){
                    //DOGSIGNUP
                    String race = JOptionPane.showInputDialog("Enter the dog's race: ");
                    String size = JOptionPane.showInputDialog(null, "Enter the dog's size: ");
                    double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the dog's weight: "));
                    String owner = JOptionPane.showInputDialog("Enter the dog's owner name: ");
                    String gender = JOptionPane.showInputDialog("Enter the dog's gender: ");
                    String specie = JOptionPane.showInputDialog("Enter the dog's specie: ");

                    dogs[countDogs] = new Dog(race);
                    dogs[countDogs].setRace(race);
                    dogs[countDogs].setSize(size);
                    dogs[countDogs].setWeight(weight);
                    dogs[countDogs].setOwner(owner);
                    dogs[countDogs].setGender(gender);
                    dogs[countDogs].setSpecie(specie);

                    countCats++;
                    JOptionPane.showInputDialog("Dog was registered successfully");

                    
                }
                else{
                    
                }
            }

            boolean apointmentOk = false;
                String apointmentOwner = JOptionPane.showInputDialog("Informe o Nome do Dono do PET");
                //
                for (int i = 0; i < countCats; i++) {
                    if (cats[i].getOwner().equals(apointmentOwner)) {
                        JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                        apointmentOk = true;
                        break;
                    }
                }
                for (int i = 0; i < countDogs; i++) {
                    if (dogs[i].getOwner().equals(apointmentOwner)) {
                        JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                        apointmentOk = true;
                        break;
                    }
                }
                for (int i = 0; i < countOthers; i++) {
                    if (Other[i].getOwner().equals(apointmentOwner)) {
                        JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                        apointmentOk = true;
                        break;
                    }
                }
                // 1º verificação ok - cadastro realizado
                // 2º verificação
                boolean schaduleOk = true;
                do {
                    String dataAgenda = JOptionPane.showInputDialog("Informe a data do Agendamento");
                    String horaAgenda = JOptionPane.showInputDialog("Informe a hora do Agendamento");
                    for (int i = 0; i <= countSchadulenda; i++) {
                        if (agendamentos[i].getDataHora().equals(dataAgenda + horaAgenda)) {
                            JOptionPane.showMessageDialog(null, "Horario já Agendado, Escolha outro");
                        } else {
                            schaduleOk = false;      
                        }
                    }
                    JOptionPane.showMessageDialog(null,"agendamento Realizado");
                            agendamentos[countSchadulenda] = new Agendamento();
                            agendamentos[countSchadulenda].setData(dataAgenda);
                            agendamentos[countSchadulenda].setHora(horaAgenda);
                            countSchadulenda++;
                }while (schaduleOk);

        }

    }



}

//NEW EXERCISE:
/*Create the Apoitments Class and Store the Consults*/


        /*boolean apointmentOk = true;
        String apointmentOwner = JOptionPane.showInputDialog("Owner name: ");

        for (int i = 0; i < countCats; i++ ){
            if(cats[i].getOwner().equals(apointmentOwner)){
                JOptionPane.showMessageDialog("Apointment found! ");
                break;
            }
        }

        boolean apointmentOk = true;
        String apointmentOwner = JOptionPane.showInputDialog("Owner name: ");

        for (int i = 0; i < countDogs; i++ ){
            if(dogs[i].getOwner().equals(apointmentOwner)){
                JOptionPane.showMessageDialog("Apointment found! ");
                break;
            }
        }

        boolean apointmentOk = true;
        String apointmentOwner = JOptionPane.showInputDialog("Owner name: ");

        for (int i = 0; i < countOthers; i++ ){
            if(others[i].getOwner().equals(apointmentOwner)){
                JOptionPane.showMessageDialog(null, "Apointment found! ");
                break;
            }
        }
        }

    }
    //VERIFY IF SIGNUP IS OK
    //2° VERIFY
    String dateTime = JOptionPane.showInputDialog("aaa");
    String dateSchadule = JOptionPane.showInputDialog("aaa");
    boolean apointmentOk = true;
    for (int i = 0; i < countApointments; i++){
        if(apointments[i].getDateTime().equals(dateSchadule)){
            JOptionPane.showMessageDialog(null, "Signed-up successfully");
        }
        else{
            apointmentOk = false;
            JOptionPane.showMessageDialog(null, "Apointment was created! ");
            apointments*/
 