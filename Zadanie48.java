package zadanie48;
import javax.swing.JOptionPane;

public class Zadanie48
{
    public static void main(String[] args)
    {
        String str1, str2;
        double czas, odleglosc;
        
        str1 = JOptionPane.showInputDialog("Podaj medium: powietrze, woda, lub stal");
        str2 = JOptionPane.showInputDialog("Podaj odległość w km");
        odleglosc = Double.parseDouble(str2);
        
        if (str1.equalsIgnoreCase("powietrze"))
        {
            czas = odleglosc / 0.343;
            JOptionPane.showMessageDialog(null, String.format("Dzwiek pokona tą odległość w powietrzu \nw czasie %.1f sek", czas ));
        }
        else if (str1.equalsIgnoreCase("woda"))
        {
            czas = odleglosc / 1.439;
            JOptionPane.showMessageDialog(null, String.format("Dzwiek pokona tą odległość w wodzie \nw czasie %.1f sek", czas ));
        }
        else
        {
            czas = odleglosc / 5.1;
            JOptionPane.showMessageDialog(null, String.format("Dzwiek pokona tą odległość w wodzie \nw czasie %.1f sek", czas));        }
            
    }
}
