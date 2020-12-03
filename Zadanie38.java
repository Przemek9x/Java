package zadanie38;
import javax.swing.JOptionPane;

public class Zadanie38
{
    public static void main(String[] args)
    {
        int value;
        String str;
        str = JOptionPane.showInputDialog("Podaj liczbę z zakresu\n1-10");
        value = Integer.parseInt(str);
        
        if (value >= 1 && value <=10)
            switch (value)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, "I");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "II");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "III");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "IV");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "V");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "VI");
                    break;
                case 7: 
                    JOptionPane.showMessageDialog(null, "VII");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "VIII");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "IX");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "X");
                    break;         
            }
        else
            JOptionPane.showMessageDialog(null, "BŁĄD");
          
    }
     
}
