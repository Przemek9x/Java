package zadanie39;
import javax.swing.JOptionPane;

public class Zadanie39
{
    public static void main(String[] args)
    {
        int day, month, year;
        String str;
        
        str = JOptionPane.showInputDialog("Podaj dzień miesiąca");
        day = Integer.parseInt(str);
        
        str = JOptionPane.showInputDialog("Podaj miesiąc");
        month = Integer.parseInt(str);
        
        str = JOptionPane.showInputDialog("Podaj końcówke roku, np dla 1960 bedzie to 60");
        year = Integer.parseInt(str);
        
        if (day * month == year)
            JOptionPane.showMessageDialog(null, "Jest to data magiczna");
        else
            JOptionPane.showMessageDialog(null, "Nie jest to data magiczna");
       
    }
}
        
        