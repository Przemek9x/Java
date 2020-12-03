package zadanie40;
import javax.swing.JOptionPane;


public class Zadanie40
{
    public static void main(String[] args)
    {
     double weight, height, bMI1, bMI;
     String str;
     
     str = JOptionPane.showInputDialog("Podaj swoją wage w kg.");
     weight = Double.parseDouble(str);
     
     str = JOptionPane.showInputDialog("Podaj swój wzrost w metrach.");
     height = Double.parseDouble(str);
     
     bMI1 = (weight * height);
     bMI = Math.pow(bMI1, 2.0);
     
     if (bMI < 18.5)
         JOptionPane.showMessageDialog(null, "Masz niedowage");
     else if (bMI >= 18.5 && bMI < 25)
         JOptionPane.showMessageDialog(null, "Masz optymalne BMI");
     else
         JOptionPane.showMessageDialog(null, "Masz nadwage");
     
    }
}
