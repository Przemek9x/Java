package zadanie46;
import javax.swing.JOptionPane;

public class Zadanie46
{
    public static void main(String[] args)
    {
        double fatCalories, calories, percent;
        int fat;
        String str;
        
        str = JOptionPane.showInputDialog("Podaj ilość kalorii w produkcie");
        calories = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Podaj ilość tłuszczu w produkcie");
        fat = Integer.parseInt(str);
        
        fatCalories = fat * 9;
        
        percent = (fatCalories/calories)*100;
        
        if (percent < 30)
            JOptionPane.showMessageDialog(null, "Produkt zawiera "+percent+ "% kalorii pochodzących z tłuszczu,\njest niskotłusczowy");
        else if (percent >= 30 && percent <= 100)
            JOptionPane.showMessageDialog(null, "Produkt zawiera " +percent+"% kalorii pochodzących z tłuszczu");
        else
            JOptionPane.showMessageDialog(null, "Nieprawidłowe dane!");
    
    }
}