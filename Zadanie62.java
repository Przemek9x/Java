package zadanie62;
import javax.swing.JOptionPane;

public class Zadanie62
{
    public static void main(String[] args)
    {
        double liczba, product;
        String str;
        product = 0;
        
        while (product <= 100)
        {
            str = JOptionPane.showInputDialog("Podaj liczbę");
            liczba = Double.parseDouble(str);
            product += liczba * 10;
            JOptionPane.showMessageDialog(null, product);
            
        }
        
        
    }
}