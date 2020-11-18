package hajs;

import javax.swing.JOptionPane;


public class Hajs {

    public static void main(String[] args) 
    {
        String inputString;
        String name;
        double payRate;
        int hours;
        double grossPay;
        
        name = JOptionPane.showInputDialog("Jak się " +
                                           "nazywasz");
        inputString = JOptionPane.showInputDialog("Ile godzin pracujesz tygodniowo?");
        hours = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Ile wynosi " + 
                                                  "Twoja stawka godzinowa?");
        payRate = Double.parseDouble(inputString);
        
        grossPay = hours * payRate;
        
        JOptionPane.showMessageDialog(null, "Twoja wypłata wynosi: " + grossPay); 
        
        System.exit(0);
    }
    
}
