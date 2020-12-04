package zadanie41;
import javax.swing.JOptionPane;

public class Zadanie41
{
    public static void main(String[] args)
    {
        int test1, test2, test3, av;
        String str;
        
        str = JOptionPane.showInputDialog("Podaj wynik testu nr 1.");
        test1 = Integer.parseInt(str);
        
        str = JOptionPane.showInputDialog("Podaj wynik testu nr 2.");
        test2 = Integer.parseInt(str);
        
        str = JOptionPane.showInputDialog("Podaj wynik testu nr 3.");
        test3 = Integer.parseInt(str);
        
        
        av = ((test1 + test2 + test3)/3);
        
        if (av >= 90 && av <= 100)
            JOptionPane.showMessageDialog(null, String.format("Srednia z testów to %d\nOtrzymujesz ocenę 5.", av));
        else if (av >= 80 && av <= 89)
            JOptionPane.showMessageDialog(null, String.format("Srednia z testów to %d\nOtrzymujesz ocenę 4.", av));
        else if (av >= 70 && av <= 79)
            JOptionPane.showMessageDialog(null, String.format("Srednia z testów to %d\nOtrzymujesz ocenę 3.", av));
        else if (av >= 60 && av <= 69)
            JOptionPane.showMessageDialog(null, String.format("Srednia z testów to %d\nOtrzymujesz ocenę 2", av));
        else
            JOptionPane.showMessageDialog(null, String.format("Srednia z testów to %d\nOtrzymujesz ocenę 1.", av));
             
    }
}
