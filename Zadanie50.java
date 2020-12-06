package zadanie50;
import javax.swing.JOptionPane;

public class Zadanie50
{
    public static void main(String[] args)
    {
        int checkNumber, basePay = 10;
        double addPay, totalPay;
        String str;
        
        str = JOptionPane.showInputDialog("Podaj liczbę wystawionych czeków");
        checkNumber = Integer.parseInt(str);
        
        if (checkNumber < 20)
        {
            addPay = 0.10;
            totalPay = basePay + (addPay * checkNumber);
            JOptionPane.showMessageDialog(null, String.format("Opłata za obsługę wynosi %.2f zł.", totalPay));
        }
        else if (checkNumber >= 20 && checkNumber <= 39)
        {
            addPay = 0.08;
            totalPay = basePay + (addPay * checkNumber);
            JOptionPane.showMessageDialog(null, String.format("Opłata za obsługę wynosi %.2f zł.", totalPay));
        }
        else if (checkNumber > 39 && checkNumber <= 59)
        {
            addPay = 0.06;
            totalPay = basePay + (addPay * checkNumber);
            JOptionPane.showMessageDialog(null, String.format("Opłata za obsługę wynosi %.2f zł.", totalPay));
        }
        else 
        {
            addPay = 0.04;
            totalPay = basePay + (addPay * checkNumber);
            JOptionPane.showMessageDialog(null, String.format("Opłata za obsługę wynosi %.2f zł.", totalPay));
        }
    }
}

