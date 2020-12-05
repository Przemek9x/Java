package zadanie45;
import javax.swing.JOptionPane;

public class Zadanie45
{
    public static void main(String[] args)
    {
        double waga, odleglosc, stawka = 0, suma;
        String str;
        
        str = JOptionPane.showInputDialog("Podaj wagę przesyłki.");
        waga = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Podaj odległość.");
        odleglosc = Double.parseDouble(str);
        
        
        if (waga <= 0)
            JOptionPane.showMessageDialog(null, "Nieprawidłowa waga");
        else if (waga <= 1)
        {
            stawka = 1.10;
            suma = ((int)(odleglosc/500))*stawka;
            JOptionPane.showMessageDialog(null, String.format("Opłata za przewóz wynosi %.1f zł", suma));
        }
        else if (waga > 1 && waga <= 3)
        {
            stawka = 2.20;
            suma = ((int)(odleglosc/500))*stawka;
            JOptionPane.showMessageDialog(null, String.format("Opłata za przewóz wynosi %.1f zł", suma));
        }
        else if (waga > 3 && waga <= 5)
        {
            stawka = 3.70;
            suma = ((int)(odleglosc/500))*stawka;
            JOptionPane.showMessageDialog(null, String.format("Opłata za przewóz wynosi %.1f zł", suma));
        }
        else 
        {
            stawka = 3.80;
            suma = ((int)(odleglosc/500))*stawka;
            JOptionPane.showMessageDialog(null, String.format("Opłata za przewóz wynosi %.1f zł", suma));
        }
        
                
        
    }
}

