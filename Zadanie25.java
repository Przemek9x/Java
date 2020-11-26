package zadanie25;
import javax.swing.JOptionPane;

public class Zadanie25
{
    public static void main(String[] args)
    {
        String imie, imie2 = "Tymoteusz";
        imie = JOptionPane.showInputDialog("Podaj swoje imie");
        
        if (imie.equalsIgnoreCase(imie2))
            JOptionPane.showMessageDialog(null, "Czy my się znamy?");
        else
            JOptionPane.showMessageDialog(null, "Siema stary!");
    }
}
