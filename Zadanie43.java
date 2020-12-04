package zadanie43;
import javax.swing.JOptionPane;


public class Zadanie43
{
    public static void main(String[] args)
    {
        double minutes, hours, days, seconds;
        String str;
        
        str = JOptionPane.showInputDialog("Podaj liczbę sekund");
        seconds = Double.parseDouble(str);
        
        minutes = seconds/60;
        hours = seconds/3600;
        days = seconds/84600;
        
        if (seconds > 60 && seconds < 3600)
            JOptionPane.showMessageDialog(null, String.format("%.1f sekund to %.2f minut", seconds, minutes));
        else if (seconds == 60)
            JOptionPane.showMessageDialog(null, String.format("%.1f sekund to %.2f minuta", seconds, minutes));
        else if (seconds > 3600 && seconds < 84600)
            JOptionPane.showMessageDialog(null, String.format("%.1f sekund to %.2f godzin", seconds, hours));
        else if (seconds == 3600)
            JOptionPane.showMessageDialog(null, String.format("%.1f sekund to %.2f godzin",seconds, hours));
        else if (seconds == 84600)
            JOptionPane.showMessageDialog(null, String.format("%.1f sekund to %.2f dzien", seconds, hours));
        else 
            JOptionPane.showMessageDialog(null, String.format("%f sekund to %.2f dni",seconds, days));
        
    }
}
