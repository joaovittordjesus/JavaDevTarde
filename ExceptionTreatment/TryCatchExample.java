//CREATE A 2 ENTRY CALCULATOR WITH 4 OPERATIONS(SUM,SUB,MULT,DIV)
package ExceptionTreatment;

import javax.swing.JOptionPane;

public class TryCatchExample {
    public static void main (String[] args){
        //Inicializing the test variables
        int n1;
        int n2;
        boolean start = true;
        String opeString[] = {"1-SUM/n", "2-SUBTRACTION/n", "3-MULTIPLICATION/n", "4-DIVISION/n"};
        int answer;
        while(start){

            try{
                answer = Integer.parseInt(JOptionPane.showInputDialog("Type: "+ opeString));
                if((answer >= 1) && (answer <= 4)){

                
            }catch(Exception e){
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, "ERROR - The Value typed is not an Integer");
                break;
            }

            if(answer == 1){
                //SUM
            }else if(answer == 2){
                //SUBTRACTION
            }else if(answer == 3){
                //MULTIPLICATION
            }else{
                //DIVISION
            }

            try{
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Type an integer: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Type another integer: "));
                JOptionPane.showMessageDialog(null, "n1 + n2 = "+ (n1 + n2));
            }
            catch(Exception e){
                //TODO: handle exception
                JOptionPane.showMessageDialog(null, "ERROR - Value" + " typed is not an integer! ");
            }
        }    
    }
}
