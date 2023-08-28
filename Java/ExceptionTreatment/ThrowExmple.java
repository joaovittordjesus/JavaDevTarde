//Importing the JOptionPane package;
import javax.swing.JOptionPane;
//Creating the main class
public class ThrowExmple {
    public static void main(String[] args) {
        //Initializing the necessary variables.
        boolean tryAgain = true;
        String password;
        String login;
        //Loop
        while (tryAgain) {
            try {
                password = JOptionPane.showInputDialog("Iform a password: ");
                login = password = JOptionPane.showInputDialog("Iform a login: ");
                if (password.length() < 8) {
                    throw new Exception("Password  less then ");
                }
                if(password.equals(login)){
                    throw new Exception("Login can't be equal to the password! ");
                }
                tryAgain = false;
            } catch (Exception e) {
                //Gettir the error message.
                JOptionPane.showMessageDialog(null, e.getMessage(),"PASSWORD", 0);
            }
        }
    }
}

/*
    Se a senha for igual a data de nascimento retornar que não pod eser igual
    Senha deve conter caractereas maiúsculos e caracteres minúsculos
    
*/ 



